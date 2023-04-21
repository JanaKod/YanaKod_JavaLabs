package org.example;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static int row, column;
    static Scanner sc = new Scanner(System.in);
    static final int N = 100;
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Enter size of the array!");
        System.out.print("Enter row: ");
        row = sc.nextInt();
        System.out.print("Enter column: ");
        column = sc.nextInt();
        sc.nextLine();

        int [][] board = new int [row][column];

        Menu1(board);
        Menu2(board);
    }
    private static void Menu2(int[][] arr) {
        String m;
        do {
            m = selectMenu2();
            switch (m) {
                case "1":
                    System.out.println("Min = " + minimumValue(arr));
                    break;
                case "2":
                    System.out.println("Min = " + maximumValue(arr));
                    break;
                case "3":
                    System.out.println("Average = " + AverageValue(arr));
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Command not recognise! Try again!");
            }
        }while(!m.equals("4"));
    }
    private static void Menu1(int[][] arr){
        String n = selectMenu1();
        while(!n.equals("1") && !n.equals("2")) {
            System.out.println("Command not recognise! Try again!");
            n = selectMenu1();
        }
        switch (n) {
            case "1":
                RandomArray(arr);
                break;
            case "2":
                YourOwnArray(arr);
                break;
            default:
                System.out.println("Command not recognise! Try again!");
        }
    }
    private static String selectMenu2() {

        System.out.println("Choose what you`d like to do");
        System.out.println("1: Find the minimum value");
        System.out.println("2: Find the maximum value");
        System.out.println("3: Find the average value of the array");
        System.out.println("4: Exit");

        String menuNumber2 = sc.nextLine();
        return menuNumber2;
    }
    private static String selectMenu1() {

        System.out.println("Choose how you want initialize the array!");
        System.out.println("1: Random numbers");
        System.out.println("2: Enter numbers");

        String menuNumber1 = sc.nextLine();
        return menuNumber1;
    }
    private static double AverageValue(int[][] arr) {

        double sum = 0.0;
        int amount = row * column;
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                sum = sum + arr[i][j];
            }
        }
        return sum/amount;
    }

    private static int maximumValue(int[][] arr) {
        int max = arr[0][0];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                if(arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    private static int minimumValue(int[][] arr) {

        int min = arr[0][0];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++){
                if(arr[i][j]<min)
                    min = arr[i][j];
            }
        }
        return min;
    }
    private static void YourOwnArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
            {
                System.out.print("a[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        printArray(arr);
    }
    private static void RandomArray(int[][] arr) {
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
                arr[i][j] = random.nextInt(N);
        printArray(arr);
    }
    private static void printArray(int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}