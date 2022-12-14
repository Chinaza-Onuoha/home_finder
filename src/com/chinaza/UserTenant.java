package com.chinaza;

public class UserTenant extends UserBaseClass {

    /**
     *  v1 beta version
     *
     * This is the user tenant class which defines the basic fields specifically for the tenant
     * . will be inherent the core user field from the UserBaseClass */

    private boolean isRenewal;
    private int rent_Duration;


    public UserTenant(String aFirst_name, String aLast_name, String aEmail, String aOccupation, String aValid_id,
                      String aPhone_number, String aGender, boolean isStatus, boolean isRenewal, int aRent_Duration) {
        super(aFirst_name, aLast_name, aEmail, aOccupation, aValid_id, aPhone_number, aGender, isStatus);
        this.isRenewal = isRenewal;
        this.rent_Duration = aRent_Duration;
    }

    public UserTenant(String aFirst_name, String aLast_name, String aEmail){
        this(aFirst_name,aLast_name,aEmail,"default occupation",null,"default phone number","male",false,false,0);

    }

    public void RentHouse(boolean isStatus){
        if(!isStatus){
            System.out.println("This is the tenant");
        }else {
            System.out.println("Only the tenant is allowed to rent a home");
        }
    }

    public boolean isRenewal() {
        return isRenewal;
    }

    public void setHasRenewal(boolean hasRenewal) {
        this.isRenewal = isRenewal;
    }

    public int getRent_Duration() {
        return rent_Duration;
    }

    public void setRent_Duration(int aRent_Duration) {
        this.rent_Duration = aRent_Duration;
    }


}
