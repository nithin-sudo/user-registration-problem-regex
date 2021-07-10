package com.bridgelabz.regex;

public class UserFields
{
    private String firstName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        return "UserFields{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
