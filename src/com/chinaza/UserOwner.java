package com.chinaza;

public class UserOwner extends UserBaseClass {
    private boolean completed ;
    /**
     * This is the user owner class which defines the basic fields specifically for the owner or whomever that
     * is managing the property.  will be inherent the core user field from the UserBaseClass */



    public  UserOwner(String aFirst_Name,String aLast_Name,String aEmail,String aOccupation,String aValid_ID,String  aPhone_Number,String aGender,boolean isStatus) {
        super(aFirst_Name,aLast_Name,aEmail,aOccupation,aValid_ID,aPhone_Number,aGender,isStatus);

    }

    public  UserOwner(String aFirst_Name, String aLast_Name, String aEmail){
        this(aFirst_Name,aLast_Name,aEmail,"default occupation",null,"default phone number","male",false);

    }


    public boolean BroadCastHouse(boolean isStatus, boolean completed){
        this.setCompleted(true);

        if(isStatus && completed){
            /** when an owner want to broadcast they should provide all the necessary details only then should they be allowed to broadcast.
             *
             * So we are going to create a field of type boolean called completed only if completed is true should  the owner be allowed  to broadcast a home*/
            System.out.println("This is the owner");
        }else {
            System.out.println("Only the owner is allowed to broadcast a home");
            System.out.println(isCompleted());
            System.out.println(isStatus);
        }
        return isStatus;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
