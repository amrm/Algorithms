package com.company.stack;

/*

 Describe how you could use array to implement stack.
 */

import java.util.Arrays;

public class Stack {

    int array[];
    int cur;
    int max=10;

    Stack(){
        array=new int[max];
        Arrays.fill(array,-1);
        cur = 0;
    }

    public void push(int i){
        if(cur == max){
            System.out.println("Stack is full");
        }
        else{
            array[cur++] = i;
        }
    }

    public void pop(){
        if(cur == 0) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Pop : "+array[cur-1]);
            array[cur-1] = -1;
            cur--;
        }
    }

    public void peek(){
        if(cur == 0) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peek : "+array[cur-1]);
        }
    }

    public int popData(){
        int data= -1;
        if(cur == 0) {
            System.out.println("Stack is empty");
        }
        else{
            data = array[cur-1];
            array[cur-1] = -1;
            cur--;
        }
        return data;
    }

    public int peekData(){
        if(cur == 0) {
            return -1;
        }
        else{
            return array[cur-1];
        }
    }

    public boolean isEmpty(){
        return cur==0;
    }

    public void print(){
        for(int i=0;i <array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String str[]){
        Stack threeInOne=new Stack();
        threeInOne.push(5);
        threeInOne.push(2);
        threeInOne.peek();
        threeInOne.peek();
        threeInOne.pop();
        threeInOne.peek();
        threeInOne.pop();
        threeInOne.peek();

        threeInOne.push(2);
        threeInOne.peek();

    }

}
