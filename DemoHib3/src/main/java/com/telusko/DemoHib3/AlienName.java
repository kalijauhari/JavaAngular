package com.telusko.DemoHib3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class AlienName {
    @Id
    private int id;
    private String fname;
    private String lname;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }
    public void setLname(String lname) { this.lname = lname; }

    @Override
    public String toString() {
        return "AlienName [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
    }
}
