package com.example.reportcybercrime.entities;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {
    private Integer reportID;
    private String incidentCategory;
    private String incidentLocation;
    private ArrayList<String> partiesInvolved;
    private ArrayList<String> devicesInvolved;
    private Integer date;
    private Integer time;
    private HashMap Evidence;
}