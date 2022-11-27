package com.chinaza;

public class UserBaseClass {
    /**
     *  v1 beta version
     *
     * This is the user base class which defines the basic fields of the user.
     * */

    private String aFirst_Name;
    private String aLast_Name;
    private String aGender;
    private String aOccupation;
    private String aValid_ID = null;
    private String aPhone_Number;
    private String aEmail;
    private boolean hasStatus; // owner or tenant

    public UserBaseClass(String aFirst_name, String aLast_name, String aGender,
                         String aOccupation, String aValid_id, String aPhone_number, String aEmail, boolean hasStatus) {
        this.aFirst_Name = aFirst_name;
        this.aLast_Name = aLast_name;
        this.aGender = aGender;
        this.aOccupation = aOccupation;
        this.aValid_ID = aValid_id;
        this.aPhone_Number = aPhone_number;
        this.aEmail = aEmail;
        this.hasStatus = hasStatus;
  }

    public String getaFirst_Name() {
        return aFirst_Name;
    }

    public void setaFirst_Name(String aFirst_Name) {
        this.aFirst_Name = aFirst_Name;
    }

    public String getaLast_Name() {
        return aLast_Name;
    }

    public void setaLast_Name(String aLast_Name) {
        this.aLast_Name = aLast_Name;
    }

    public String getaGender() {
        return aGender;
    }

    public void setaGender(String aGender) {
        this.aGender = aGender;
    }

    public String getaOccupation() {
        return aOccupation;
    }

    public void setaOccupation(String aOccupation) {
        this.aOccupation = aOccupation;
    }

    public String getaValid_ID() {
        return aValid_ID;
    }

    public void setaValid_ID(String aValid_ID) {
        this.aValid_ID = aValid_ID;
    }

    public String getaPhone_Number() {
        return aPhone_Number;
    }

    public void setaPhone_Number(String aPhone_Number) {
        this.aPhone_Number = aPhone_Number;
    }

    public String getaEmail() {
        return aEmail;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public boolean isHasStatus() {
        return hasStatus;
    }

    public void setHasStatus(boolean hasStatus) {
        this.hasStatus = hasStatus;
    }
}
