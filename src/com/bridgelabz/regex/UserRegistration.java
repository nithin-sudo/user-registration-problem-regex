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
     * asking user to enter the email and setting the email.
     */
    public void userEmail()
    {
        System.out.print("enter the email:");
        String email = scanner.next();
        boolean emailMatcher = Pattern.compile("^[a-z]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$").matcher(email).matches();
        if(emailMatcher == true)
        {
            userFields.setEmail(email);
        }
        else
        {
            System.err.println("you have entered wrong input E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions ");
            System.out.println();
            userEmail();
        }
    }
    /**
     * asking user to enter the mobile number and setting the mobile number.
     */
    public void userMobileNumber()
    {
        System.out.print("enter the Mobile Number:");
        String mobileNumber = scanner.nextLine();
        boolean mobileNumberMatcher = Pattern.compile("^[0-9]\\d{1}\\s[789]\\d{9}$").matcher(mobileNumber).matches();
        if(mobileNumberMatcher == true)
        {
            userFields.setMobileNumber(mobileNumber);
        }
        else
        {
            System.err.println("you have entered wrong input Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number");
            System.out.println();
            userMobileNumber();
        }
    }
    /**
     * asking user to enter the password and setting the password.
     */
    public void userPassWord()
    {
        System.out.print("enter the user password:");
        String password = scanner.next();
        boolean passwordMatcher = Pattern.compile("^[a-z]{8}$").matcher(password).matches();
        if(passwordMatcher == true)
        {
            userFields.setPassword(password);
        }
        else
        {
            System.err.println("you have entered wrong input User need to follow pre -defined Password rules minimum 8  Characters ");
            System.out.println();
            userPassWord();
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
        userRegistration.userEmail();
        userRegistration.userMobileNumber();
        userRegistration.userPassWord();
        userRegistration.printUserDetails();
    }

}
