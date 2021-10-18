package com.myprofile.myprofile.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MyManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long managerid;

    private String level;
    private String name;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empid", updatable = false, insertable = true)
    private MyProfile myprofile;

    public MyManager() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getManagerid() {
        return managerid;
    }

    public void setManagerid(Long managerid) {
        this.managerid = managerid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMyProfile(MyProfile myprofile) {
        this.myprofile = myprofile;
    }

}
