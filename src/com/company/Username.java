package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {

    public static final Pattern USER_NAME = Pattern.compile("^[a-zA-Z]([_]?[a-zA-Z0-9]+([\\w]{2,}))*$");

    public static boolean validate(String username) {

        if(username == null || username.isEmpty())
            return false;

        String str[]= username.split("_");
        int f=username.indexOf("_");
        if(str.length>2 || f ==str.length-1)
            return false;

        Matcher matcher = USER_NAME.matcher(username);
        return matcher.matches();
    }


    public static void main(String[] args) {
        System.out.println(validate("mmmm_")); // Valid username
        System.out.println(validate("Mike Standish")); // Invalid username

        System.out.println(validate("Mike_S3443tandish")); // Valid username
    }
}