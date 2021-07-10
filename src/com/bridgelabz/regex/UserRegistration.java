package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    Scanner scanner ;
    UserFields userFields;
    /**
     * instantiating scanner and userFields in constructor.
     */
    public UserRegistration()
    {
        scanner = new Scanner(System.in);
        userFields = new UserFields();
    }
    /**
     * asking user to enter the first name and setting the firstname.
     */
    public void firstName()
    {
        System.out.print("enter the first name:");
        String firstName = scanner.next();
        boolean firstNameMatcher = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(firstName).matches();
        if(firstNameMatcher == true)
        {
           userFields.setFirstName(firstName);
        }
        else
        {
           System.err.println("you have entered wrong input First name starts with Cap and has minimum 3 characters");
           System.out.println();
           firstName();
        }
    }
    /**
     * asking user to enter the last name and setting the lastname.
     */
    public void lastName()
    {
        System.out.print("enter the last name:");
        String lastName = scanner.next();
        boolean lastNameMatcher = Pattern.compile("^[A-Z]{1}[A-Z a-z]{2,}$").matcher(lastName).matches();
        if(lastNameMatcher == true)
        {
            userFields.setLastName(lastName);
        }
        else
        {
            System.err.println("you have entered wrong input last name starts with Cap and has minimum 3 characters");
            System.out.println();
            lastName();
        }
    }
    /**
     * printing the user details.
     */
    public void printUserDetails()
    {
        if(userFields.getFirstName()!=null)
        {
            System.out.print(userFields);
        }
    }
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.printUserDetails();
    }

}
