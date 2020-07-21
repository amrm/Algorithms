package com.company.todo;

/*

Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

 */

public class RotateMatrixTo90Degree {

    public void rotate( int arr [][]){
        int arr2[][]=new int[arr.length][arr[0].length];

        //TODO complex
       // https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
    }

    public static void main(String str[]){
        RotateMatrixTo90Degree r=new RotateMatrixTo90Degree();
        int arr[][]=new int [3][4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;

        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;

        r.rotate(arr);
        r.print(arr);

    }

    public void print(int arr[][]){

        for(int i =0 ; i < arr.length;i++){
            for(int j=0;j < arr[i].length; j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
