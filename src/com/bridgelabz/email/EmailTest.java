package com.bridgelabz.email;
import java.util.ArrayList;
import java.util.regex.*;

public class EmailTest {

    public static void main(String[] args)
        {
            ArrayList<String> emails = new ArrayList<>();

            emails.add("abc@yahoo.com");
            emails.add("abc-100@yahoo.com");
            emails.add("abc.100@yahoo.com");
            emails.add("abc111@abc.com");
            emails.add("abc-100@abc.net");
            emails.add("abc.100@abc.com.au");
            emails.add("abc@1.com");
            emails.add("abc@gmail.com.com");
            emails.add("abc+100@gmail.com");

            emails.add("abc");
            emails.add("abc@.com.my");
            emails.add("abc123@gmail.a");
            emails.add("abc123@.com");
            emails.add(".abc@abc.com");
            emails.add("abc()*@gmail.com");
            emails.add("abc@%*.com");
            emails.add("abc..2002@gmail.com");
            emails.add("abc.@gmail.com");
            emails.add("abc@abc@gnail.com");
            emails.add("abc@gmail.com.1a");
            emails.add("abc@gmail.com.aa.au");

            int number = 1;
            for(String email : emails)
            {
                boolean emailMatcher = Pattern.compile("^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$").matcher(email).matches();
                System.out.println(number++ + "." + email +":" + emailMatcher);
            }
        }
}
