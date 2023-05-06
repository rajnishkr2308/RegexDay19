package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Problem");
        /*
        UC1: User need to enter Valid firstname
         */
//        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}"); //For Reference
//        Matcher matcher = pattern.matcher("Rajnish");  //For Reference

        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}","Rajnish");
        if (result1)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }
}
