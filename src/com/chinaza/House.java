package com.chinaza;

public class House {
    /**
     * v1 beta version
     *
     * This is the house class which defines the core fields specifically for the house
     * */
    private boolean hasStatus;
    private double aRent;
    private double aCharges;
    private double aAgency_Percentage;
    private double aAgreement_Percentage;
    private double aCaution_Fee;
    private String aMinutes_Video = null;
    private String aType;
    private String aRating;
    private String aReview;
    private String aLocation;
    private String aUser_Owner_Profile; // v2 use the composition pattern to access the user profile;
    private String aColour_Paint;
    private String aSize;
    private int aNumber_Rooms;
    private int aNumber_Windows;

    



    /**
     * Write a method which will calculate the agency and agreement amount using the percentage variable*/


     // Getters and setter for the house class

    public void setHasStatus(boolean hasStatus) {
        this.hasStatus = hasStatus;
    }
    public boolean getHasStatus() {
        return hasStatus;
    }

    public double getaRent() {
        return aRent;
    }

    public void setaRent(double aRent) {
        this.aRent = aRent;
    }

    public double getaCharges() {
        return aCharges;
    }

    public void setaCharges(double aCharges) {
        this.aCharges = aCharges;
    }

    public double getaAgency_Percentage() {
        return aAgency_Percentage;
    }

    public void setaAgency_Percentage(double aAgency_Percentage) {
        this.aAgency_Percentage = aAgency_Percentage;
    }

    public double getaAgreement_Percentage() {
        return aAgreement_Percentage;
    }

    public void setaAgreement_Percentage(double aAgreement_Percentage) {
        this.aAgreement_Percentage = aAgreement_Percentage;
    }

    public double getaCaution_Fee() {
        return aCaution_Fee;
    }

    public void setaCaution_Fee(double aCaution_Fee) {
        this.aCaution_Fee = aCaution_Fee;
    }

    public String getaMinutes_Video() {
        return aMinutes_Video;
    }

    public void setaMinutes_Video(String aMinutes_Video) {
        this.aMinutes_Video = aMinutes_Video;
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    public String getaRating() {
        return aRating;
    }

    public void setaRating(String aRating) {
        this.aRating = aRating;
    }

    public String getaReview() {
        return aReview;
    }

    public void setaReview(String aReview) {
        this.aReview = aReview;
    }

    public String getaLocation() {
        return aLocation;
    }

    public void setaLocation(String aLocation) {
        this.aLocation = aLocation;
    }

    public String getaUser_Owner_Profile() {
        return aUser_Owner_Profile;
    }

    public void setaUser_Owner_Profile(String aUser_Owner_Profile) {
        this.aUser_Owner_Profile = aUser_Owner_Profile;
    }

    public String getaColour_Paint() {
        return aColour_Paint;
    }

    public void setaColour_Paint(String aColour_Paint) {
        this.aColour_Paint = aColour_Paint;
    }

    public String getaSize() {
        return aSize;
    }

    public void setaSize(String aSize) {
        this.aSize = aSize;
    }

    public int getaNumber_Rooms() {
        return aNumber_Rooms;
    }

    public void setaNumber_Rooms(int aNumber_Rooms) {
        this.aNumber_Rooms = aNumber_Rooms;
    }

    public int getaNumber_Windows() {
        return aNumber_Windows;
    }

    public void setaNumber_Windows(int aNumber_Windows) {
        this.aNumber_Windows = aNumber_Windows;
    }
}
