package kr.hs.dgsw.java.push;

import java.util.Scanner;

public class SimpleStack {

    private static final int SIZE = 10; // static : 상수

    private String[] array = new String[SIZE];

    private int top;

    public void push(String value) {
        array[top] = value;
        top++;
    }

    public String pop() {
        top--;
        return array[top];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleStack simpleStack = new SimpleStack();

        String word = null;
        String command = null;
        while(true) {
            command = scanner.next();
            if ("push".equals(command)) {
                if (simpleStack.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                }
                word = scanner.next();
                simpleStack.push(word);
            } else if ("pop".equals(command)) {
                if (simpleStack.isEmpty()) {
                    System.out.println();
                    continue;
                }
                System.out.println(simpleStack.pop());
            } else if ("quit".equals(command)) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }

    private boolean isFull() {
        return top == 10;
    }

    private boolean isEmpty() {
        return top == 0;
    }
}
