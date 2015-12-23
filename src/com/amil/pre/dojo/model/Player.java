package com.amil.pre.dojo.model;

import java.util.HashMap;

public class Player implements Comparable<Player>{
	
	private String name;
	private HashMap<String, Weapon> weapons = new HashMap<>();
	private Integer qtdKills = 0;
	private Integer qtdDeaths = 0;
	
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getQtdKills() {
		return qtdKills;
	}
	
	public void setQtdKills(Integer qtdKills) {
		this.qtdKills = qtdKills;
	}
	
	public Integer getQtdDeaths() {
		return qtdDeaths;
	}
	
	public void setQtdDeads(Integer qtdDeaths) {
		this.qtdDeaths = qtdDeaths;
	}
	
	public void addKiller(){
		this.qtdKills++;
	}
	
	public void addDead(){
		this.qtdDeaths++;
	}
	
	public HashMap<String, Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(HashMap<String, Weapon> weapons) {
		this.weapons = weapons;
	}

	@Override
	public int compareTo(Player o) {
		Player player = (Player) o;
		
		if(this.getQtdKills() > player.getQtdKills()){
			return -1;
		}else{
			if(this.getQtdKills() < player.getQtdKills()){
				return 1;
			}else{
				return 0;
			}
		}
	}

}
