package com.chinaza;

public class UserOwner extends UserBaseClass {
    /**
     * This is the user owner class which defines the basic fields specifically for the owner or whomever that
     * is managing the property.  will be inherent the core user field from the UserBaseClass */

   // private double aRent;


    public  UserOwner(String aFirst_Name,String aLast_Name,String aGender,String aOccupation,String aValid_ID,String  aPhone_Number,String aEmail,boolean hasStatus) {
        super(aFirst_Name,aLast_Name,aGender,aOccupation,aValid_ID,aPhone_Number,aEmail,hasStatus);

    }


    // the increase rent method will return the new rent
//    private double IncreaseRent(double new_Rent) {
//        return new_Rent;
//    }
//
//    public double getaRent() {
//        return aRent;
//    }
//
//    public void setaRent(double aRent) {
//        this.aRent = aRent;}

}
