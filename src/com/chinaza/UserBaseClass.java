package com.chinaza;

public class UserBaseClass {
    /**
     *  v1 beta version
     *
     * This is the user base class which defines the basic fields of the user.
     * */

    private String first_Name;
    private String last_Name;
    private String gender;
    private String occupation;
    private String valid_ID = null;
    private String phone_Number;
    private String email;
    private boolean isStatus; // owner or tenant

    public UserBaseClass(String aFirst_name, String aLast_name, String aEmail, String aOccupation,
                         String aValid_id, String aPhone_number, String aGender, boolean isStatus) {
        this.first_Name = aFirst_name;
        this.last_Name = aLast_name;
        this.gender = aGender;
        this.occupation = aOccupation;
        this.valid_ID = aValid_id;
        this.phone_Number = aPhone_number;
        this.email = aEmail;
        this.isStatus = isStatus;
  }



  public boolean ValidateStatus(String status){
      String s = this.isStatus  ? "tenant" : "owner";
      return s.toLowerCase().equals(status);
  }


    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String aFirst_Name) {
        this.first_Name = aFirst_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String aLast_Name) {
        this.last_Name = aLast_Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String aGender) {
        this.gender = aGender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String aOccupation) {
        this.occupation = aOccupation;
    }

    public String getValid_ID() {
        return valid_ID;
    }

    public void setValid_ID(String aValid_ID) {
        this.valid_ID = aValid_ID;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String aPhone_Number) {
        this.phone_Number = aPhone_Number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    public boolean getIsStatus() {
        return isStatus;
    }

    public void setIstatus(boolean isStatus) {
        this.isStatus = isStatus;
    }
}
