package com.company.stack;

/*

Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.

 */
public class QueueStack {

    Stack stack1;
    Stack stack2;

    QueueStack() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void queue(int data) {
        stack1.push(data);
    }

    public void dequeue() {
        if (stack2.peekData() == -1) {
            while (stack1.peekData() != -1) {
                stack2.push(stack1.popData());
            }
        }
        System.out.println("Dequeue : "+stack2.popData());
    }

    public static void main(String str[]) {
        QueueStack qs = new QueueStack();
        qs.queue(1);
        qs.queue(2);
        qs.queue(3);
        qs.dequeue();
        qs.queue(4);
        qs.dequeue();
        qs.queue(5);
        qs.queue(6);
        qs.dequeue();
        qs.dequeue();
        qs.dequeue();

        qs.dequeue();
        qs.dequeue();
        qs.queue(7);
        qs.queue(8);
        qs.dequeue();

    }
}
