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
           System.err.print("\nyou have entered wrong input First name starts with Cap and has minimum 3 characters");
        }
    }

    /**
     * printing the user details.
     */
    public void printUserDetails()
    {
        if(userFields.getFirstName() != null)
        {
            System.out.print(userFields);
        }

    }
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstName();
        userRegistration.printUserDetails();
    }

}
