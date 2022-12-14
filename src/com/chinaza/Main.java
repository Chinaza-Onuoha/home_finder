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


        /** Building and setting the value for a user owner Object from the UserOwner class
         *
         * Owner should only sign up with name, phone number or email
         * */

        UserOwner owner_one = new UserOwner("David","Onuoha","developerworkpace@gmail.com");



        /** Building and setting the value for a user tenant Object from the UserTenant class
         *
         * Tenant should only sign up with name, phone number or email*/

        UserTenant tenant_one = new UserTenant("Michael","Jonas","mikejonas@gmail.com");




    /** Building and setting the value for a house Object from the House class*/

        boolean hasBroadCast = owner_one.BroadCastHouse(owner_one.ValidateStatus("owner"),true);

         if(hasBroadCast){
             House two_Bedroom_Apartment = new House(true,50_000,1_200_000,5.8,
                     5.8,50_000,5,"5",null,
                     "terrace","Good","The house actually gave more that its promise, i love it!!!","lekki","David","white","Big");
             String status = two_Bedroom_Apartment.HouseDetails();
             if (!two_Bedroom_Apartment.getIsTaken()) {
                 two_Bedroom_Apartment.HouseDetails();
             }
             System.out.println(status);
         }

         //tenant_one.RentHouse(tenant_one.ValidateStatus("tenant"));


/**What should be the behaviour of the House?
 *
 *
 * What task can the owner perform?
 * 1) it is the duty of the owner to broadcast a home(to create the house object).
 * 2) It is the duty of the owner to increment a rent(tenant must be notified)
 *
 * What task can the tenant perform?
 * 1) it is the duty of the tenant to rent a house.
 * 2) It is the duty of the tenant to renew rent or not(the owner must be notified:
 * the application will ask the user in the last 6 months before the expiration if the want to renew or not)
 * */

    }
}
