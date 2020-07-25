package com.company.stack;

/*

Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
an additional temporary stack, but you may not copy the elements into any other data structure
(such as an array). The stack supports the following operations: push, pop, peek, and is Empty.

 */
public class SortStack {

    Stack stack;
    Stack temp;

    SortStack() {
        stack = new Stack();
        temp = new Stack();
    }

    public void push(int data) {
        if (stack.isEmpty())
            stack.push(data);
        else {

            int topValue = stack.peekData();
            stack.push(data);

            if (topValue < data) {
                int max = stack.popData();
                while (stack.peekData() != -1) {
                    int s = stack.popData();
                    if(s > max)
                    {
                        temp.push(max);
                        max = s;
                    }
                    else{
                        temp.push(s);
                    }
                }
                temp.push(max);

                while (temp.peekData() != -1) {
                    stack.push(temp.popData());
                }
            }
        }
    }

    public void print(){
        stack.print();
    }

    public static void main(String str[]) {

        SortStack sortStack=new SortStack();
        sortStack.push(1);
        sortStack.push(7);
        sortStack.push(2);
        sortStack.push(8);
        sortStack.push(88);
        sortStack.push(66);
        sortStack.push(0);
        sortStack.push(1);

        sortStack.print();

    }

}
