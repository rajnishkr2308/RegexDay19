package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Regex Problem");
        /*
        UC1: User need to enter Valid firstname
         */
//        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}"); //For Reference
//        Matcher matcher = pattern.matcher("Rajnish");  //For Reference

        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}", "Rajnish");
        if (result1)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
        /*
        uc2: User need to enter Last name
         */

        Pattern pattern = Pattern.compile("^[A-Z]?[a-z]{3,}$");
        Matcher matcher = pattern.matcher("Kumar");
        Matcher matcher1 = pattern.matcher("Kumar");
        if (matcher.matches() && matcher1.matches())
            System.out.println("valid");
        else
            System.out.println("Invalid");
        /*
        Uc3:User need valid Email
         */

        boolean result3 = Pattern.matches("[a-z]{3,}[.][a-z0-9]*@[a-z]{2,}[.][a-z]{2,}[.]*[a-z]*", "rajneeshsingh9905@gmail.com");
        if (result3)
            System.out.println("Valid Email Address");
        else
            System.out.println("Invalid Email Address");
        /*
        U4:User need to follow pr-defined mobile Format
         */

        System.out.print("Enter Mobile number:- ");
        String mobileNumber = sc.next();
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher4 = pattern4.matcher("7541061533");
        if (matcher4.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");

        }
    }
}


