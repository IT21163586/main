package character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        character.StackX s1 = new character.StackX(5);
        character.QueueX q1 = new character.QueueX(5);
        character.QueueX q2 = new character.QueueX(5);

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5 ; i++) {
            System.out.println("Enter character : ");
            q1.insert(sc.next().charAt(0));
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
