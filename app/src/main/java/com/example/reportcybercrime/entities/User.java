package com.example.reportcybercrime.entities;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    ArrayList<Report> reportList;

    public User(String username, String password, ArrayList<Report> reportList) {
        this.username = username;
        this.password = password;
        this.reportList = reportList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Report> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<Report> reportList) {
        this.reportList = reportList;
    }

    public void addReport(Report report){
        this.reportList.add(report);
    }
}
