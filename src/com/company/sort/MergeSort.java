package com.company.sort;

import java.util.Arrays;

public class MergeSort {

    /**
     * n log n in worst case.
     */

    public static void main(String ...args){
        int array[] = {1,45,2,6,2,7,23,765,23,23,1,02,42,245};
        //int array[] = {12,4};
        MergeSort m=new MergeSort();
        m.startDivide(array,0,array.length-1);

        System.out.println(Arrays.toString(array));

    }

    public void startDivide(int array[],int start,int end){
        if(end-start == 0 ){
           return;
        }

        int medium=start+(end-start)/2;
        startDivide(array,start,medium);
        startDivide(array,medium+1,end);
        mergeSort(array,start,medium,end);
    }

    public void mergeSort(int array[], int start,int medium,int end){
        int result[] = new int[(end-start) +1];
        int r=0;

        int i=start;
        int j=medium+1;

        while(i < medium+1 && j < end+1){
            if(array[i]>array[j]){
                result[r++]=array[j];
                j++;
            }
            else{
                result[r++]=array[i];
                i++;
            }
        }

        if(i < medium+1){
            for(int s=i;s<medium+1;s++){
                result[r++]=array[s];
            }
        }

        if(j < end+1){
            for(int s=j;s<end+1;s++){
                result[r++]=array[s];
            }
        }

        i=0;
        for(int k=start;k<=end;k++){
            array[k]=result[i++];
        }
    }
}
