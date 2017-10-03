package com.BillZ;

/**
 * Created by Bill on 5/22/17.
 */
public class VipCustomer {

    //when fields are marked private, must use getters to send
    private String name;
    private long creditLimit;
    private String email;




    //these 3 are constructors
    public VipCustomer() {
        this("customer", 10000, "default@email.com");
        System.out.println("VIP empty constructor called");

    }

    public VipCustomer(String name, long creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "default@email.com";

    }

    public VipCustomer(String name, long creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    //these 3 are getters
    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
