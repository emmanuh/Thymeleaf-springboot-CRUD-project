package com.emuthui.entity;

import javax.persistence.*;

@Entity

public class County {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String capital;
    
	public County(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	public County() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "County [id=" + id + ", name=" + name + ", capital=" + capital + "]";
	}
    
	
	
    
}
