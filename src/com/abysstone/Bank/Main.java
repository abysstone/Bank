package com.abysstone.Bank;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        if(bank.addBranch("Delhi")) {
            System.out.println("Delhi branch created");
        }

        bank.addCustomer("Delhi", "Ram", 50.05);
        bank.addCustomer("Delhi", "Shyam", 175.34);
        bank.addCustomer("Delhi", "Amit", 220.12);

        bank.addBranch("Mumbai");
        bank.addCustomer("Mumbai", "Rahul", 150.54);

        bank.addCustomerTransaction("Delhi", "Ram", 44.22);
        bank.addCustomerTransaction("Delhi", "Ram", 12.44);
        bank.addCustomerTransaction("Delhi", "Shyam", 1.65);

        bank.listCustomers("Delhi", true);
        bank.listCustomers("Mumbai", true);

        bank.addBranch("Lucknow");

        if(!bank.addCustomer("Lucknow", "Aman", 5.53)) {
            System.out.println("Error Lucknow branch does not exist");
        }

        if(!bank.addBranch("Delhi")) {
            System.out.println("Delhi branch already exists");
        }

        if(!bank.addCustomerTransaction("Delhi", "Pankaj", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Delhi", "Ram", 12.21)) {
            System.out.println("Customer Ram already exists");
        }


    }
}