package com.company.sort;

import java.util.Arrays;

public class InsertionSort {

    /***
        best case, we'll have to move the whole sorted list by one, which is O(n). so best case O(n)
        We have to do this for each element in every array, which means it's going to be bounded by O(n^2) in worst case.
     * @param array
     */
    public void sort(int array[]){
        for(int i=1;i < array.length;i++){
            int j=i-1;
            int cur=i;
            while(array[cur] < array[j] && j >=0 ){
                swap(array,cur,j);
                cur--;
                j--;
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
        InsertionSort b=new InsertionSort();
        b.sort(array);
        System.out.println(Arrays.toString(array));

    }}
