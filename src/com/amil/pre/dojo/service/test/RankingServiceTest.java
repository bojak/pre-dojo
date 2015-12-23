package com.amil.pre.dojo.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.amil.pre.dojo.model.Match;
import com.amil.pre.dojo.model.Player;
import com.amil.pre.dojo.service.LogParserService;
import com.amil.pre.dojo.service.RankingService;

public class RankingServiceTest {
	
	
	private RankingService rankingService = new RankingService();
	private LogParserService logParserService = new LogParserService();
	
	@Test
	public void ranking_with_2_matches_test() {
		List<String> logResult = this.logParserService.parseFile(System.getProperty("user.dir") + "/resources/test/logPreDojoWithTwoMatchs");
		List<Match> matches = this.rankingService.getRanking(logResult);
		assertTrue(matches.size() == 2);
		assertTrue(matches.get(0).getMatchId().equals("11348964"));
		assertTrue(matches.get(1).getMatchId().equals("11348965"));
	}
	
	@Test
	public void ranking_success(){
		List<String> logResult = this.logParserService.parseFile(System.getProperty("user.dir") + "/resources/test/logPreDojoWithTwoMatchs");
		List<Match> matches = this.rankingService.getRanking(logResult);
		
		Match match1 = matches.get(0);
		List<Player> playersMatch1 = match1.getPlayers();
		
		Match match2 = matches.get(1);
		List<Player> playersMatch2 = match2.getPlayers();
		
		//Ignore player <WORLD> - match1
		assertTrue(match1.getQtdMatchKills() == 3);
		assertTrue(playersMatch1.get(0).getQtdDeaths() == 0);
		assertTrue(playersMatch1.get(0).getQtdKills() == 3);
		assertTrue(playersMatch1.get(1).getQtdDeaths() == 3);
		assertTrue(playersMatch1.get(1).getQtdKills() == 0);
		
		//match2
		assertTrue(match2.getQtdMatchKills() == 4);
		assertTrue(playersMatch2.get(0).getQtdDeaths() == 0);
		assertTrue(playersMatch2.get(0).getQtdKills() == 4);
		assertTrue(playersMatch2.get(1).getQtdDeaths() == 4);
		assertTrue(playersMatch2.get(1).getQtdKills() == 0);
	}

}
