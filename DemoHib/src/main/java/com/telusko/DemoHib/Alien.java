package com.telusko.DemoHib;

import jakarta.persistence.Embedded;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;

@Entity
public class Alien {
	
	
	  @Id
      private int aid;
	  
	  @Embedded
      private AlienName aname;
      // private String aname;  
	  
	  
      private String color;
       
       
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
//	public String getAname() {
//		return aname;
//	}
//	public void setAname(String aname) {
//		this.aname = aname;
//	}
	public String getColor() {
		return color;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
       
       
}
