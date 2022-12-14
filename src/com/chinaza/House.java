package com.chinaza;

public class House {
    /**
     * v1 beta version
     *
     * This is the house class which defines the core fields specifically for the house
     * */
    private boolean isTaken = false;
    private double charges;
    private double rent;
    private double agency_Percentage;
    private double agreement_Percentage;
    private double caution_Fee;
    private int number_Windows;
    private String number_Rooms;
    private String minutes_Video = null;
    private String type;
    private String rating;
    private String review;
    private String location;
    private String owner_Profile; // v2 use the composition pattern to access the user profile;
    private String colour_Paint;
    private String size;


    


    // Initializing the fields using a constructor
    public House(boolean isTaken, double charges, double rent, double agency_Percentage, double agreement_Percentage, double caution_Fee,
                 int number_Windows, String number_Rooms, String minutes_Video, String type, String rating, String review, String location, String owner_Profile,
                 String colour_Paint, String size){
        this.isTaken = isTaken;
        this.charges = charges;
        this.rent = rent;
        this.agency_Percentage = agency_Percentage;
        this.agreement_Percentage = agreement_Percentage;
        this.caution_Fee = caution_Fee;
        this.number_Windows = number_Windows;
        this.number_Rooms = number_Rooms;
        this.minutes_Video = minutes_Video;
        this.type = type;
        this.rating = rating;
        this.review = review;
        this.location = location;
        this.owner_Profile = owner_Profile;

    }


    //Task 1

      public String HouseDetails(){
          boolean status = this.isTaken;
          if(status){
            return "Renew Rent";
          } else {
              // show the house details with option of rent
              System.out.println("Type: " + getType());
              System.out.println("Rent: " + getRent());
              System.out.println("Review: " + getReview());
              System.out.println("Rating: " + getRating());
              System.out.println("Location: " + getLocation());
              System.out.println("Number of Rooms: " + getNumber_Of_Rooms());

          }
         return "Rent";
      }


    /**
     * Write a method which will calculate the agency and agreement amount using the percentage variable*/


     // Getters and setter for the house class

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
    public boolean getIsTaken() {
        return isTaken;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double aRent) {
        this.rent = aRent;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double aCharges) {
        this.charges = aCharges;
    }

    public double getAgency_Percentage() {
        return agency_Percentage;
    }

    public void setAgency_Percentage(double aAgency_Percentage) {
        this.agency_Percentage = aAgency_Percentage;
    }

    public double getAgreement_Percentage() {
        return agreement_Percentage;
    }

    public void setAgreement_Percentage(double aAgreement_Percentage) {
        this.agreement_Percentage = aAgreement_Percentage;
    }

    public double getCaution_Fee() {
        return caution_Fee;
    }

    public void setCaution_Fee(double aCaution_Fee) {
        this.caution_Fee = aCaution_Fee;
    }

    public String getMinutes_Video() {
        return minutes_Video;
    }

    public void setMinutes_Video(String aMinutes_Video) {
        this.minutes_Video = aMinutes_Video;
    }

    public String getType() {
        return type;
    }

    public void setType(String aType) {
        this.type = aType;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String aRating) {
        this.rating = aRating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String aReview) {
        this.review = aReview;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String aLocation) {
        this.location = aLocation;
    }

    public String getOwner_Profile() {
        return owner_Profile;
    }

    public void setOwner_Profile(String aOwner_Profile) {
        this.owner_Profile = aOwner_Profile;
    }

    public String getColour_Paint() {
        return colour_Paint;
    }

    public void setColour_Paint(String aColour_Paint) {
        this.colour_Paint = aColour_Paint;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String aSize) {
        this.size = aSize;
    }

    public String getNumber_Of_Rooms() {
        return number_Rooms;
    }

    public void setNumber_Of_Rooms(String  aNumber_Rooms) {
        this.number_Rooms = aNumber_Rooms;
    }

    public int getNumber_Of_Windows() {
        return number_Windows;
    }

    public void setNumber_Of_Windows(int aNumber_Windows) {
        this.number_Windows = aNumber_Windows;
    }
}
