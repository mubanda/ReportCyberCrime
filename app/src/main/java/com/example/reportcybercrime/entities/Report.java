package com.example.reportcybercrime.entities;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {
    private Integer reportID;
    //Unauthorised Access (Outsider), Malware, Outage, Inappropiate Access (Insider), Espionage, Data Breach, Other (decribe)
    private String crimeCategory;
    private String crimeLocation;
    private ArrayList<String> partiesInvolved;
    private ArrayList<String> devicesInvolved;
    private Integer date;
    private Integer time;
    private HashMap evidence;
    private String referenceCode;
}