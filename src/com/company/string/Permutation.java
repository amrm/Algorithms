package com.company.string;

/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.

 */
public class Permutation {

    public boolean isPermutation(String str1,String str2){

        if(str1.length()!=str2.length())
            return false;

        int count[]=new int[128];
        for(char ch:str1.toCharArray()){
            count[ch]++;
        }

        for(char ch:str2.toCharArray()){
            count[ch]--;
            if(count[ch] < 0)
                return false;
        }

        return true;
    }

    public static void main(String str[]){

        System.out.println(".....................................");
        Permutation p=new Permutation();
        System.out.println(p.isPermutation("bod","dob"));
        System.out.println(p.isPermutation("amany","ynama"));
        System.out.println(p.isPermutation("amte","etmas"));

    }
}
