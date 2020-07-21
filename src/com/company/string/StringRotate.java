package com.company.string;

/*

String Rotation: Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to i5Sub5tring (e.g., "waterbottle" is a rotation of" erbottlewat").
 */
public class StringRotate {

    public boolean isRotate(String str1,String str2){
        if(str1!=null && str2!=null){
            if((str1+str1).contains(str2)){
                return true;
            }
        }
       return false;
    }

    public static void main(String str[]){
        StringRotate r=new StringRotate();
        System.out.println(r.isRotate("amr","ram"));
        System.out.println(r.isRotate("waterbottle","erbottlewat"));

    }
}
