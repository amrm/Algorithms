package com.company.sort;

import java.util.Arrays;

public class QuickSort {

    /***
     Quick sort and heap sort they are best algorithms for sorting  in worst case : n log n
     It will pickup pivot and sort depend on it, put on left which is smaller than pivot and put on right which is bigger than pivot
     will using recursive

     Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle. It has an average O(n log n) complexity and it’s one of the most used sorting algorithms, especially for big data volumes.

     It's important to remember that Quicksort isn't a stable algorithm. A stable sorting algorithm is an algorithm where the elements with the same values appear in the same order in the sorted output as they appear in the input list.

     The input list is divided into two sub-lists by an element called pivot; one sub-list with elements less than the pivot and another one with elements greater than the pivot. This process repeats for each sub-list.

     */

    // 1,45,50,34,1,12
    // 1, 45, 2, 6, 2, 7, 23, 765, 23, 23, 1, 2, 42, 245

    public int partition(int array[],int start,int end){
        int pivot=array[end];
        int pivotIndex=end;

        while(end!=start){
            if(pivotIndex > start){
                if(array[start] > pivot ){
                    swap(array,start,pivotIndex);
                    pivotIndex=start;
                    end--;
                }
                else{
                    start++;
                }
            }
            else{

                if(array[end] < pivot ){
                    swap(array,end,pivotIndex);
                    pivotIndex=end;
                    start++;
                }
                else{
                    end--;
                }
            }

        }


        return pivotIndex;
    }

    public void sort(int array[], int start, int end) {
        if(end-start > 0 ){
            int partition=partition(array,start,end);
            sort(array,start,partition-1);
            sort(array,partition+1,end);
        }
    }

    public void swap(int array[], int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

    public static void main(String... args) {
        int array[] = {1, 45, 2, 6, 2, 7, 23, 765, 23, 23, 1, 2, 42, 245};
        QuickSort b = new QuickSort();
        b.sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
}
