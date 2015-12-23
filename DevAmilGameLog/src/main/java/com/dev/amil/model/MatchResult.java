package com.dev.amil.model;

import java.util.List;

public class MatchResult {

	private List<PlayerMatch> playerMatchs;
	private Player winnerPlayer;
	private Integer sequenceWithoutDeath;
	private Integer award;
	private Match match;

	public List<PlayerMatch> getPlayerMatchs() {
		return playerMatchs;
	}

	public void setPlayerMatchs(List<PlayerMatch> playerMatchs) {
		this.playerMatchs = playerMatchs;
	}

	public Player getWinnerPlayer() {
		return winnerPlayer;
	}

	public void setWinnerPlayer(Player winnerPlayer) {
		this.winnerPlayer = winnerPlayer;
	}

	public Integer getSequenceWithoutDeath() {
		return sequenceWithoutDeath;
	}

	public void setSequenceWithoutDeath(Integer sequenceWithoutDeath) {
		this.sequenceWithoutDeath = sequenceWithoutDeath;
	}

	public Integer getAward() {
		return award;
	}

	public void setAward(Integer award) {
		this.award = award;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

}
