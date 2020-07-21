package com.company.string;

import java.util.Arrays;

/*

Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat'; "atc o eta·; etc.)

 */
public class PalindromePermutation {

    public boolean isPermutation(String str){

        char ch[]=str.toCharArray();
        Arrays.sort(ch);

        int unique = 0;
        char prev = 0;
        for(char c:ch){
            if(c == ' ') {
                prev = 0;
                continue;
            }
            else if(c!=prev) {
                unique++;
                prev=c;
            }
            else {
                unique--;
                prev=0;
            }
        }

        return unique <= 1;
    }

    public static void main(String str[]){

        System.out.println(".....................................");
        PalindromePermutation p=new PalindromePermutation();
        System.out.println(p.isPermutation("tactt cooaa"));
        System.out.println(p.isPermutation("tact cooaa"));

    }
}
