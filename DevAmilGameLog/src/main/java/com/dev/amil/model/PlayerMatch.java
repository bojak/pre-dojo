package com.dev.amil.model;

import java.util.Date;
import java.util.List;

public class PlayerMatch {
	private Match match;
	private Integer kills;
	private Integer deaths;
	private Integer sequenceWithoutDeaths;
	private Integer award;
	private Date timeKill;
	private List<WeaponPlayerMatch> weaponPlayerMatchs;

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Integer getKills() {
		return kills;
	}

	public void setKills(Integer kills) {
		this.kills = kills;
	}

	public Integer getDeaths() {
		return deaths;
	}

	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

	public Integer getSequenceWithoutDeaths() {
		return sequenceWithoutDeaths;
	}

	public void setSequenceWithoutDeaths(Integer sequenceWithoutDeaths) {
		this.sequenceWithoutDeaths = sequenceWithoutDeaths;
	}

	public Integer getAward() {
		return award;
	}

	public void setAward(Integer award) {
		this.award = award;
	}

	public Date getTimeKill() {
		return timeKill;
	}

	public void setTimeKill(Date timeKill) {
		this.timeKill = timeKill;
	}

	public List<WeaponPlayerMatch> getWeaponPlayerMatchs() {
		return weaponPlayerMatchs;
	}

	public void setWeaponPlayerMatchs(List<WeaponPlayerMatch> weaponPlayerMatchs) {
		this.weaponPlayerMatchs = weaponPlayerMatchs;
	}

}
