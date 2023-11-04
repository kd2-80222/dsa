package com.sunbeam;

public class Queue {
	 private int arr[];
     int rear;
    private int front;
    private final int SIZE;

    public Queue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = -1;
        rear = -1;
    }

    public void push(int data) {
        if (rear == SIZE - 1) {
            System.out.println("Queue is full. Cannot push element: " + data);
        } else {
            rear++;
            arr[rear] = data;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            front++;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[front + 1];
        }
        return -1; // Return a sentinel value for an empty queue.
    }

    public boolean isFull() {
        return rear == SIZE - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }
}
