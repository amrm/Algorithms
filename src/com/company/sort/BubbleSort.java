package com.company.sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * O(n^2) in worst case.
     *
     */

    public void sort(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    swap(array,i,j);
                }
            }
        }
    }

    public void swap(int array[],int i,int j){
        array[i]=array[i]+array[j];
        array[j]=array[i]-array[j];

        array[i]=array[i]-array[j];
    }


    public static void main(String ...args){
        int array[] = {1,45,2,6,2,7,23,765,23,23,1,02,42,245};
        //int array[] = {12,4};
        BubbleSort b=new BubbleSort();
        b.sort(array);
        System.out.println(Arrays.toString(array));

    }}
