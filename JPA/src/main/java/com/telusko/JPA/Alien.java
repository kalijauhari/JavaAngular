package com.telusko.JPA;

import jakarta.persistence.*;

@Entity  
public class Alien {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment
    private int aid;
    
    private String color;

    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
