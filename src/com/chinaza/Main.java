package com.chinaza;

public class Main {

    public static void main(String[] args) {
	/**
     *  v1 beta version
     *  Using the object orientation programing: classes, constructor, encapsulation,inheritance, composition etc.
     *
     *  To build a simple, yet powerful and flexible home locator application which has the ability to run on the mobile devices, web and blockchain.
     *
     *
     *
     * if I broadcast a home for rent, it will send it to everybody on the network who is open for "rent" which  their interest,
     * request match the broadcast.
     */

        /** Building and setting the value for a user owner Object from the UserOwner class*/

        UserOwner david_one = new UserOwner("David","Onuoha","Male","Java Software Developer",
                null,"+234-810-3104-747","developerworkpace@gmail.com",true);


        /** Building and setting the value for a user tenant Object from the UserTenant class*/

        UserTenant michael_one = new UserTenant("Michael","Jonas","Male","Doctor",null,
                "+19-344-6785-982","michael52@gmail.com",false);

        System.out.println(david_one.getaGender());

    /** Building and setting the value for a house Object from the House class*/

        House two_Bedroom_Apartment = new House();

        two_Bedroom_Apartment.setHasStatus(true);
        two_Bedroom_Apartment.setaAgency_Percentage(5.8);
        two_Bedroom_Apartment.setaAgreement_Percentage(5.8);
        two_Bedroom_Apartment.setaCharges(50_000);
        two_Bedroom_Apartment.setaCaution_Fee(50_000);
        two_Bedroom_Apartment.setaColour_Paint("white");
        two_Bedroom_Apartment.setaLocation("Lekki");
        two_Bedroom_Apartment.setaMinutes_Video(null);
        two_Bedroom_Apartment.setaNumber_Rooms(2);
        two_Bedroom_Apartment.setaNumber_Windows(5);
        two_Bedroom_Apartment.setaType("terrace");
        two_Bedroom_Apartment.setaRating("Good");
        two_Bedroom_Apartment.setaUser_Owner_Profile("David");
        two_Bedroom_Apartment.setaReview("The house actually gave more that its promise, i love it!!!");
        two_Bedroom_Apartment.setaRent(1_2_000_000);
        two_Bedroom_Apartment.setaSize("Big");




    }
}
