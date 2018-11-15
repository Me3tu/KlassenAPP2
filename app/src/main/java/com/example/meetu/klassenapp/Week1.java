package com.example.meetu.klassenapp;

public class Week1 {

    private String Monday;
    private String Tuesday;
    private String Wednesday;
    private String Thursday;
    private String Friday;
    private String Datum;

    public Week1() {
    }



    public Week1(String mon, String die, String mit, String don, String fri, String dat) {
        this.Monday = mon;
        this.Tuesday = die;
        this.Wednesday = mit;
        this.Thursday = don;
        this.Friday = fri;
        this.Datum = dat;




    }
    public String getMonday() {
        return Monday;
    }

    public void setMonday(String mon) {
        this.Monday = mon;
    }

    public String getTuesday() {
        return Tuesday;
    }

    public void setTuesday(String die) {
        this.Tuesday = die;
    }

    public String getWednesday() {
        return Wednesday;
    }

    public void setWednesday(String mit) {
        this.Wednesday = mit;
    }

    public String getThursday() {
        return Thursday;
    }

    public void setThursday(String don) {
        this.Thursday = don;
    }

    public String getFriday() {
        return Friday;
    }

    public void setFriday(String fri) {
        this.Friday = fri;
    }
    public String getDatum() {
        return Datum;
    }

    public void setDatum(String dat) {
        this.Datum = dat;
    }

}
