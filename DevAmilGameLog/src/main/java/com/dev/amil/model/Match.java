package com.dev.amil.model;

import java.util.List;

public class Match {

	private Long id;
	List<PlayerMatch> playerMatchs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PlayerMatch> getPlayerMatchs() {
		return playerMatchs;
	}

	public void setPlayerMatchs(List<PlayerMatch> playerMatchs) {
		this.playerMatchs = playerMatchs;
	}

}
