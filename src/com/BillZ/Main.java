package com.BillZ;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is: " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is: " + porsche.getModel());
        System.out.println("******************************************");


        BankAccount bill = new BankAccount();
        BankAccount joe = new BankAccount(1234, 50.10, "joe@joe.com", "Joe the engineer",
                "3089798");
        BankAccount krista = new BankAccount();

        bill.setAccountNumber(856335);
        bill.setBalance(575.85);
        bill.setCustomerEmail("bill@bill.com");
        bill.setCustomerName("Bill Master of Java");
        bill.setPhoneNumber("8563369898");

        System.out.println("Bills bank acct number is: " + bill.getAccountNumber());
        System.out.println("Bills bank acct balance is: " + bill.getBalance());
        System.out.println("Bills bank acct email is: " + bill.getCustomerEmail());
        System.out.println("Bills bank acct name is: " + bill.getCustomerName());
        System.out.println("Bills bank acct phone number is: " + bill.getPhoneNumber());

        bill.deposit(35.80);
        System.out.println("Bills bank acct balance is: " + bill.getBalance());
        bill.withdrawl(208.6);
        System.out.println("Bills bank acct balance is: " + bill.getBalance());
        bill.withdrawl(50000);


        System.out.println("Bills bank acct number is: " + bill.getAccountNumber());

        System.out.println("******************************************");

        System.out.println("Joes bank acct number is: " + joe.getAccountNumber());
        System.out.println("Joes bank acct balance is: " + joe.getBalance());
        System.out.println("Joes bank acct email is: " + joe.getCustomerEmail());
        System.out.println("Joes bank acct name is: " + joe.getCustomerName());
        System.out.println("Joes bank acct phone number is: " + joe.getPhoneNumber());

        System.out.println("******************************************");

        System.out.println("Kristas bank acct number is: " + krista.getAccountNumber());
        System.out.println("Kristas bank acct balance is: " + krista.getBalance());
        System.out.println("Kristas bank acct email is: " + krista.getCustomerEmail());
        System.out.println("Kristas bank acct name is: " + krista.getCustomerName());
        System.out.println("Kristas bank acct phone number is: " + krista.getPhoneNumber());

        System.out.println("******************************************");

        VipCustomer mrsZerega = new VipCustomer();
        VipCustomer mrZerega = new VipCustomer("Bill Mr Z", 85000);
        VipCustomer keri = new VipCustomer("keri", 32000, "Kerri@kerri.com");

        System.out.println("The customer " + mrsZerega.getName() + " has a credit limit of " +
                mrsZerega.getCreditLimit() +" and their email is " + mrsZerega.getEmail());
        System.out.println("The customer " + mrZerega.getName()+ " has a credit limit of " +
                mrZerega.getCreditLimit() +" and their email is " + mrZerega.getEmail());
        System.out.println("The customer " + keri.getName() + " has a credit limit of " +
                keri.getCreditLimit() +" and their email is " + keri.getEmail());
    }
}
