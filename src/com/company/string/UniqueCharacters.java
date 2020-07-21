package com.company.string;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */
public class UniqueCharacters {

    public boolean isUnique(String str){
        char chars[]=str.toCharArray();
        boolean bool[]=new boolean[255];

        for(char ch:chars){
            if(bool[ch])
                return false;
            bool[ch]=true;
        }

        return true;
    }

    public static void main(String str[]){
        System.out.println(".....................................");
        UniqueCharacters characters=new UniqueCharacters();
        System.out.println(characters.isUnique("abcdelf"));
        System.out.println(characters.isUnique("abdefrwaiop"));
        System.out.println(characters.isUnique("abdkjel;wq=÷"));
    }
}
