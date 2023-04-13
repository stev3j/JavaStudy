package kr.hs.dgsw.java.push;

import java.util.Scanner;

public class Queue {

    private static final int SIZE = 10; // static : 상수

    private String[] que = new String[SIZE];

    private int front;
    private int rear;
    public void enqueue(String value) {
        rear = (rear+1)%SIZE;
        que[rear] = value;
    }
    
    public String dequeue() {
        front = (front+1)%SIZE;
        return que[front];
    }

    private boolean isFull() {
        return (rear+1)%SIZE == front;
    }

    private boolean isEmpty() {
        return rear == front;
    }

    private int size() {
        return ((rear - front + 1) + SIZE) % SIZE;
    }

    public static void main(String[] args) {
        Queue que = new Queue();
        Scanner scanner = new Scanner(System.in);

        String word = null;
        String command = null;
        while(true) {
            command = scanner.next();
            if ("en".equals(command)) {
                if (que.isFull()) {
                    System.out.println("Queue Full");
                    continue;
                }
                word = scanner.next();
                que.enqueue(word);
            } else if ("de".equals(command)) {
                if (que.isEmpty()) {
                    System.out.println();
                    continue;
                }
                System.out.println(que.dequeue());
            } else if ("size".equals(command)) {
                System.out.println(que.size());;
            } else if ("quit".equals(command)) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}
