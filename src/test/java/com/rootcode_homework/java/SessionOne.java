package com.rootcode_homework.java;

import com.github.javafaker.Faker;

public class SessionOne {

    public static void main(String[] args) {

        //Question2-Create two strings with price tags 10.5 and 12.5. Assign the total to a variable and display the total as "Total is USD 23.0"

        String priceTag1 = "10.5";
        String priceTag2 = "12.5";

        double totalPrice = Double.parseDouble(priceTag1) + Double.parseDouble(priceTag2);
        System.out.println("Question 2:");
        System.out.println("Total is USD " + totalPrice + "\n");


        //Question3-Create three variables to hold address information and create a method to get Address.


        String houseNumber = "No 25";
        String streetName = "Flower Road";
        String city = "Wellawatte";

        String fullAddress = getFullAddress(houseNumber,streetName,city);

        System.out.println("Question 3:");
        System.out.println("Full Address is  " + fullAddress + "\n");


        // Question 4-Generate a random phoneNumber and an address using JavaFaker
        // ---generate phone number

        System.out.println("Question 4:");

        Faker faker = new Faker();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println(String.format("Phone Number: %s", phoneNumber));

        //---generate address

        String address = faker.address().fullAddress();
        System.out.println(String.format("Address: %s", address));

    }

    //method to get the full address-Question2
    private static String getFullAddress(String houseNumber, String streetName, String city) {

        String fulladdress = String.format("%s , %s  , %s", houseNumber, streetName, city);

        return fulladdress;
    }

}
