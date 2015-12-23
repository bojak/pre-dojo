package com.amil.pre.dojo.model;

import java.util.Date;
import java.util.List;



public class Match {
	
	private String matchId;
	private List<Player> players;
	private Integer qtdMatchKills = 0;
	private Date startMarch;
	private Date endMatch;
	private Player winnerPlayer;
	private Weapon mostUsedWeapon;
	
	public String getMatchId() {
		return matchId;
	}
	
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	
	public List<Player> getPlayers() {
		return players;
	}
	
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public Integer getQtdMatchKills() {
		return qtdMatchKills;
	}
	
	public void setQtdMatchKills(Integer qtdMatchKills) {
		this.qtdMatchKills = qtdMatchKills;
	}
	
	public void addQtdMatchKills(){
		this.qtdMatchKills++;
	}

	public Date getStartMarch() {
		return startMarch;
	}

	public void setStartMarch(Date startMarch) {
		this.startMarch = startMarch;
	}

	public Date getEndMatch() {
		return endMatch;
	}

	public void setEndMatch(Date endMatch) {
		this.endMatch = endMatch;
	}

	public Player getWinnerPlayer() {
		return winnerPlayer;
	}

	public void setWinnerPlayer(Player winnerPlayer) {
		this.winnerPlayer = winnerPlayer;
	}

	public Weapon getMostUsedWeapon() {
		return mostUsedWeapon;
	}

	public void setMostUsedWeapon(Weapon mostUsedWeapon) {
		this.mostUsedWeapon = mostUsedWeapon;
	}

}
