package hw2;

import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        task1(10);
        task2();
        task3();
        task4(11);
        task5(10);
        task6(10);
    }

    public static void task1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(100);
            if (x %2 == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        printArray(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i]==1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        printArray(arr);
    }

    public static void task2() {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i]=i*3;
        }
        printArray(arr);
    }

    public static void task3() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
    }

    public static void task4(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n-i-1] = 1;
        }
        printMatrix(arr);
    }

    public static void task5(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr [i];
            }
        }
        printArray(arr);
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void task6(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(5);
        }
        printArray(arr);
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++) {
            sumRight += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sumLeft += arr[i];
            sumRight -= arr[i];
            if (sumLeft == sumRight) {
                System.out.println("Found balance at position " + i);
                return;
            }
        }
        System.out.println("Balance is not found");
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

}
