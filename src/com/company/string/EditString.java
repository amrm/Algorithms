package com.company.string;

/*
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale,
ple
-> true
pales, pale -> true
pale, bale -> true
pale, bae -> false
* */
public class EditString {

    //edit (remove, replace, insert)
    public boolean oneEdit(String str1,String str2){
        int dif = str1.length()-str2.length();

        if(dif == 0){
            return checkOneReplacement(str1,str2);
        }
        else if(dif == 1){
            return checkOneInsert(str1,str2);
        }
        else if( dif== -1){
            return checkOneInsert(str2,str1);
        }
        return false;
    }

    public boolean checkOneReplacement(String str1,String str2){

        int edit = 0 ;
        for(int i=0;i< str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i))
                edit++;
        }

        return edit == 1;
    }

    public boolean checkOneInsert(String str1,String str2){

        int insert = 0 ;
        int pointer = 0;
        for(int i=0;i< str1.length();i++){
            if(pointer >= str2.length()  || str1.charAt(i)!=str2.charAt(pointer)) {
                insert++;
            }
            else{
                pointer++;
            }
        }

        return insert == 1;
    }


    public static void main(String str[]){

        System.out.println(".....................................");
        EditString p=new EditString();
        System.out.println(p.oneEdit("pale","ple"));
        System.out.println(p.oneEdit("pales","pale"));
        System.out.println(p.oneEdit("pale","bale"));
        System.out.println(p.oneEdit("pale","bae"));

    }
}
