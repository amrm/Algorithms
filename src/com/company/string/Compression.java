package com.company.string;

/*

String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

 */
public class Compression {

    public String compress(String str){
        StringBuilder builder=new StringBuilder();

        char prev=0;
        int count=0;

        for(char c:str.toCharArray()){
            if(c!=prev && prev != 0){
                builder.append(prev + "" + count);
                count=1;
            }
            else
                count++;

            prev = c;
        }

        builder.append(prev + "" + count);

        return builder.toString().length() < str.length()?builder.toString():str;
    }

    public static void main(String str[]){
        Compression c=new Compression();
        System.out.println(c.compress("aabcccccaaa"));
        System.out.println(c.compress("abc"));
    }
}
