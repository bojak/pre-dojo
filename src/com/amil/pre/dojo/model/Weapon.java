package com.amil.pre.dojo.model;

public class Weapon implements Comparable<Weapon> {
	
	private String name;
	private Integer weaponUseQtd;
	
	public Weapon(String name, Integer weaponUseQtd ) {
		this.name = name;
		this.weaponUseQtd = weaponUseQtd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeaponUseQtd() {
		return weaponUseQtd;
	}

	public void setUseQtd(Integer useQtd) {
		this.weaponUseQtd = useQtd;
	}
	
	public void addWeaponUseQtd(){
		this.weaponUseQtd++;
	}
	
	@Override
	public int compareTo(Weapon o) {
		Weapon weapon = (Weapon) o;
		
		if(this.getWeaponUseQtd() > weapon.getWeaponUseQtd()){
			return -1;
		}else{
			if(this.getWeaponUseQtd() < weapon.getWeaponUseQtd()){
				return 1;
			}else{
				return 0;
			}
		}
	}

}
