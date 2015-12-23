package com.amil.pre.dojo.run;

import java.util.List;

import javax.swing.JOptionPane;

import com.amil.pre.dojo.model.Match;
import com.amil.pre.dojo.model.Player;
import com.amil.pre.dojo.service.LogParserService;
import com.amil.pre.dojo.service.RankingService;

public class ProcessRanking {
		
	private static String PATH = System.getProperty("user.dir"); 
	private static String PATH_LOG = PATH + "/resources/service/logPreDojo";
	
	public static void main(String [ ] args){
		
		LogParserService logParserService = new LogParserService();
		RankingService rankingService = new RankingService();
		
		List<String> parserResult =  logParserService.parseFile(PATH_LOG);
		List<Match> matchesResult = rankingService.getRanking(parserResult);
		
		String showResult = "";
		
		for(Match match:matchesResult){
			showResult += "\n Partida = " + match.getMatchId();
			for(Player player: match.getPlayers()){
				showResult += "\n  -> Jogador = " + player.getName();
				showResult += " -> Quantidade de assassinatos = " + player.getQtdKills();
				showResult += " -> Quantidade de mortes = " + player.getQtdDeaths();
			}
			showResult += "\n  -> Total de assassinatos da partida = " + match.getQtdMatchKills();
			showResult += "\n  -> Vencedor da partida = " + match.getWinnerPlayer().getName();
			showResult += "\n  -> Arma mais usada pelo vencedor = " + match.getMostUsedWeapon().getName() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, showResult);
	}
	
}
