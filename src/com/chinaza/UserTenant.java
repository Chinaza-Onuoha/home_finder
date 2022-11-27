package com.chinaza;

public class UserTenant extends UserBaseClass {

    /**
     *  v1 beta version
     *
     * This is the user tenant class which defines the basic fields specifically for the tenant
     * . will be inherent the core user field from the UserBaseClass */

    private boolean hasRenewal;
    private int aRent_Duration;


    public UserTenant(String aFirst_name, String aLast_name, String aGender, String aOccupation, String aValid_id, String aPhone_number, String aEmail, boolean hasStatus) {
        super(aFirst_name, aLast_name, aGender, aOccupation, aValid_id, aPhone_number, aEmail, hasStatus);
    }

    public boolean hasRenewal() {
        return hasRenewal;
    }

    public void setHasRenewal(boolean hasRenewal) {
        this.hasRenewal = hasRenewal;
    }

    public int getaRent_Duration() {
        return aRent_Duration;
    }

    public void setaRent_Duration(int aRent_Duration) {
        this.aRent_Duration = aRent_Duration;
    }
}
