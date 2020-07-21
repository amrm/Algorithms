package com.company.stack;

/*

Stack Min: How would you design a stack which, in addition to push and pop, has a function min
which returns the minimum element? Push, pop and min should all operate in 0(1) time

Solution : keep min with each node
 */

import java.util.Arrays;

public class StackWithMin {
    StackNodeMin array[];
    int cur;
    int max = 10;

    StackWithMin() {
        array = new StackNodeMin[max];
        Arrays.fill(array, null);
        cur = 0;
    }

    public void push(int i) {
        if (cur == max) {
            System.out.println("Stack is full");
        } else {
            int min = i;
            if(cur > 0 && array[cur-1].min < i){
                min = array[cur-1].min;
            }
            array[cur++] = new StackNodeMin(i,min);
        }
    }

    public void pop() {
        if (cur == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Pop : " + array[cur - 1].val);
            array[cur - 1] = null;
            cur--;
        }
    }

    public void peek() {
        if (cur == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peek : " + array[cur - 1].val);
        }
    }

    public void min(){
        if (cur == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Min : " + array[cur - 1].min);
        }
    }

    public static void main(String str[]) {
        StackWithMin threeInOne = new StackWithMin();
        threeInOne.min();
        threeInOne.push(5);
        threeInOne.min();
        threeInOne.push(2);
        threeInOne.min();

        threeInOne.push(2);
        threeInOne.push(5);
        threeInOne.push(1);
        threeInOne.push(10);
        threeInOne.min();
        threeInOne.pop();
        threeInOne.min();
        threeInOne.pop();
        threeInOne.min();
    }

}

class StackNodeMin {
    int val;
    int min;

    StackNodeMin(int val, int min) {
        this.val = val;
        this.min = min;
    }

}
