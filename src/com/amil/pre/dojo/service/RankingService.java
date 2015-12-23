package com.amil.pre.dojo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.amil.pre.dojo.model.Match;
import com.amil.pre.dojo.model.Player;
import com.amil.pre.dojo.model.Weapon;

public class RankingService {
	
	private static final int PLAYER_KILLER = 3;
	private static final int PLAYER_DEAD = 5;
	private static final int WEAPON = 7;
	private static final List<String> PROHIBITED_PLAYERS = Arrays.asList("<WORLD>");
	
	
	public List<Match> getRanking(List<String> logResult){
		
		List<Match> resultMatchs = new ArrayList<>();
		Match match = null;
		HashMap<String, Player> playersMatch = new HashMap<>();
		
		for(String lineLog : logResult){
			
			match = getMatch(resultMatchs, match, lineLog, playersMatch);
			
			if(match != null){
				if(!this.isEndMatch(lineLog) && !this.isStartMatch(lineLog) ){
					
					String[] line = lineLog.split(" ");
					
					if(!PROHIBITED_PLAYERS.contains(line[PLAYER_KILLER])){
						match.addQtdMatchKills();
						this.addPlayerKiller(playersMatch, line);
						this.addPlayerKilled(playersMatch, line);
					}
					
				}
			}
		}
		
		return resultMatchs;
		
	}

	private void addPlayerKilled(HashMap<String, Player> playersMatch,
			String[] line) {
		Player player;
		if(playersMatch.containsKey(line[PLAYER_DEAD])){
			player = playersMatch.get(line[PLAYER_DEAD]);
			player.addDead();
		} else {
			player = new Player(line[PLAYER_DEAD]);
			player.addDead();
			playersMatch.put(line[PLAYER_DEAD], player);
		}
	}

	private void addPlayerKiller(HashMap<String, Player> playersMatch,
			String[] line) {
		Player player;
		if(playersMatch.containsKey(line[PLAYER_KILLER])){
			player = playersMatch.get(line[PLAYER_KILLER]);
			player.addKiller();
			if(player.getWeapons().containsKey(line[WEAPON])){
				player.getWeapons().get(line[WEAPON]).addWeaponUseQtd();
			} else {
				player.getWeapons().put(line[WEAPON], new Weapon(line[WEAPON], 1));
			}
		} else {
			player = new Player(line[PLAYER_KILLER]);
			player.addKiller();
			playersMatch.put(line[PLAYER_KILLER], player);
			player.getWeapons().put(line[WEAPON], new Weapon(line[WEAPON], 1));
		}
	}

	private Match getMatch(List<Match> resultMatchs, Match match,
			String lineLog, HashMap<String, Player> playersMatch) {
		if(this.isStartMatch(lineLog)){
			match = new Match();
			String[] line = lineLog.split(" ");
			match.setMatchId(line[PLAYER_DEAD]);
		} else if(this.isEndMatch(lineLog)){
			List<Player> players = new ArrayList<>(playersMatch.values());
			Collections.sort(players);
			match.setPlayers(players);
			Player winPlayer = players.iterator().next();
			List<Weapon> mostUsedWeapons = new ArrayList<>(winPlayer.getWeapons().values());
			Collections.sort(mostUsedWeapons);
			match.setWinnerPlayer(winPlayer);
			match.setMostUsedWeapon(mostUsedWeapons.iterator().next());
			resultMatchs.add(match);
			match = null;
			playersMatch.clear();
		}
		return match;
	}

	
	private boolean isEndMatch(String lineLog) {
		return lineLog.contains("Match") && lineLog.contains("ended");
	}

	private boolean isStartMatch(String lineLog) {
		return lineLog.contains("New") && lineLog.contains("match") && lineLog.contains("started");
	}

}
