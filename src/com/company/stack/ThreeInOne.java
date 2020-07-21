package com.company.stack;

/*

Three in One: Describe how you could use a single array to implement three stacks.

answer: we can use one array with divide size to number stack each stack has capacity in array
 */

import java.util.Arrays;

public class ThreeInOne {
    int array[];
    int cur[];
    int max = 30;
    int numStack;
    int capacity=0;

    ThreeInOne(int numStack) {
        array = new int[max];
        Arrays.fill(array, -1);
        cur = new int[numStack];
        this.numStack = numStack;
        capacity = max/numStack;
        for(int i=0;i< numStack;i++){
            cur[i] = (i * capacity);
        }
    }

    public void push(int i, int stack) {
        if (cur[stack-1] >= ( stack * capacity)) {
            System.out.println("Stack"+stack+" is full");
        } else {
            array[cur[stack-1]++] = i;
        }
    }

    public void pop(int stack) {
        if (cur[stack-1] == ((stack-1) * capacity )) {
            System.out.println("Stack"+stack+" is empty");
        } else {
            System.out.println("Stack"+stack+" Pop : " + array[cur[stack-1]-1]);
            array[cur[stack-1]-1] = -1;
            cur[stack-1] --;
        }
    }

    public void peek(int stack) {
        if (cur[stack-1] == ((stack-1) * capacity )) {
            System.out.println("Stack"+stack+" is empty");
        } else {
            System.out.println("Stack"+stack+" Peek : " + array[cur[stack-1]-1]);
        }
    }

    public static void main(String str[]) {
        ThreeInOne threeInOne = new ThreeInOne(3);
        threeInOne.push(1,1);
        threeInOne.push(2,1);
        threeInOne.peek(1);
        threeInOne.peek(1);
        threeInOne.pop(1);
        threeInOne.peek(1);
        threeInOne.pop(1);
        threeInOne.peek(1);

        threeInOne.push(2,1);
        threeInOne.peek(1);

        for(int i=0;i<14;i++){
            threeInOne.push(1,1);
        }

        threeInOne.peek(1);
        threeInOne.peek(2);
        threeInOne.peek(3);

        for(int i=0;i<14;i++){
            threeInOne.push(2,2);
        }

        threeInOne.peek(1);
        threeInOne.peek(2);
        threeInOne.peek(3);

        for(int i=0;i<14;i++){
            threeInOne.push(3,3);
        }

        threeInOne.peek(1);
        threeInOne.peek(2);
        threeInOne.peek(3);

        threeInOne.pop(1);
        threeInOne.pop(2);
        threeInOne.pop(3);
        threeInOne.push(20,2);
        threeInOne.print();

    }

    public void print(){
        for(int i=0; i<array.length; i++){
            System.out.println(i+ " : "+array[i]);
        }
    }

}
