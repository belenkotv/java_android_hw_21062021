package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        boolean ok = true;
        while (ok) {
            play();
            System.out.print("Do you want to play more? 1 - yes / 0 - no ");
            ok = sc.nextInt() == 1;
        }
    }

    static void play() {
        int x = random.nextInt(10);
        for (int i = 0; i <3; i++) {
            char result = guess(x);
            System.out.println(result);
            if (result == '=') {
                System.out.println("You are winner");
                return;
            }
        }
        System.out.println("You are loser");
    }

    static char guess(int x) {
        System.out.print("Enter number:");
        int y = sc.nextInt();
        if (x < y) {
            return '<';
        }
        if (x > y) {
            return '>';
        }
        return '=';
    }

}
