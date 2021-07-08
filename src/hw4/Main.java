package hw4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    static char[][] arr;

    static final char CELL_EMPTY = '•';
    static final char CELL_X = 'X';
    static final char CELL_O = 'O';

    public static void main(String[] args) {
        task1(3);
    }

    public static void task1(int n) {
        arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = CELL_EMPTY;
            }
        }
        while (true) {
            printMap();
            playerMove();
            if (isWin(CELL_X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isEndOfGame()) {
                System.out.println("Ничья!");
                break;
            }
            printMap();
            computerMove();
            if (isWin(CELL_O)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isEndOfGame()) {
                System.out.println("Ничья!");
                break;
            }
        }
        printMap();
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void playerMove() {
        int x, y;
        do {
            System.out.println("Введите координаты хода в формате Y X: ");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        arr[y][x] = CELL_X;
    }

    static void computerMove() {
        int x, y;
        do {
            x = random.nextInt(arr.length);
            y = random.nextInt(arr.length);
        } while (!isCellValid(x, y));
        arr[y][x] = CELL_O;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || x > arr.length || y < 0 || y > arr.length)
            return false;
        return (arr[y][x] == CELL_EMPTY);
    }

    static boolean isEndOfGame() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == CELL_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char c) {
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (; j < arr.length; j++) {
                if (arr[i][j] != c) {
                    break;
                }
            }
            if (j == arr.length) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (; j < arr.length; j++) {
                if (arr[j][i] != c) {
                    break;
                }
            }
            if (j == arr.length) {
                return true;
            }
        }
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i][i] != c) {
                break;
            }
        }
        if (i == arr.length) {
            return true;
        }
        for (; i < arr.length; i++) {
            if (arr[arr.length - i - 1][i] != c) {
                break;
            }
        }
        if (i == arr.length) {
            return true;
        }
        return false;
    }

}
