package Lecture1;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        StackX s1 = new StackX(5);
        QueueX q1 = new QueueX(5);
        QueueX q2 = new QueueX(5);

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5 ; i++) {
            System.out.println("Enter Number : ");
            q1.insert(sc.nextInt());
        }

        while(!q1.isEmpty()) {
            s1.push(q1.remove());
        }
        while(!s1.isEmpty()) {
            q2.insert(s1.pop());
        }
        while(!q2.isEmpty()) {
            System.out.println(q2.remove());
        }
    }
}