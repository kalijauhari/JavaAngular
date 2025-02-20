package com.telusko.DemoHib3;

import jakarta.persistence.*;

@Entity
class Alien {
    @Id
    private int aid;
    private String color;

    // One-to-One Relationship with FetchType.LAZY
    @OneToOne(fetch = FetchType.LAZY)
    private AlienName aname;

    // Getters and Setters
    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public AlienName getAname() { return aname; }
    public void setAname(AlienName aname) { this.aname = aname; }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", color=" + color + "]";
    }
}
