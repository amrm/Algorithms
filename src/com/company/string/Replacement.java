package com.company.string;

/*

URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
", 13
Input: "Mr John Smith
Output: "Mr%20John%20Smith"
 */
public class Replacement {

    public char[] replace(char[] letters) {

        int spaceCount=0;
        for (char c:letters) {
            if(c==' ')
                spaceCount++;
        }

        char newLetters[] = new char[letters.length+spaceCount*2];

        int curIndex=0;
        int oldIndex=0;

        for(char c:letters){
            if(letters[oldIndex]==' '){
                newLetters[curIndex++]='%';
                newLetters[curIndex++]='2';
                newLetters[curIndex++]='0';
                oldIndex++;
            }
            else{
                newLetters[curIndex++]=letters[oldIndex++];
            }
        }

        return newLetters;
    }

    public static void main(String str[]) {

        System.out.println(".....................................");
        Replacement p = new Replacement();
        p.print(p.replace(new char[] {'a',' ','b'}));
        p.print(p.replace(new char[] {'m','r',' ','j','o','h','n',' ','s','m','i','t','h'}));

    }
    public void print (char [] arr){
        for(char c:arr){
            System.out.print(c);
        }
        System.out.println();
    }
}
