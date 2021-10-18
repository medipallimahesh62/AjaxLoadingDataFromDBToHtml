package com.myprofile.myprofile.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MyProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;

    private String empname;
    private String designation;
    private String businessvertical;
    private String project;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empid", updatable = false, insertable = true)
    private List<MyManager> mymanager;

    public MyProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBusinessvertical() {
        return businessvertical;
    }

    public void setBusinessvertical(String businessvertical) {
        this.businessvertical = businessvertical;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<MyManager> getMyManager() {
        return mymanager;
    }

    public void setMyManager(List<MyManager> mymanager) {
        this.mymanager = mymanager;
    }

}
