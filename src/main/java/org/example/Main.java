package org.example;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static int row, column;
    static final int N = 100;
    static Random random = new Random();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        row = sc.nextInt();
        System.out.print("Enter column: ");
        column = sc.nextInt();
        sc.nextLine();

        sc.close();

        int [][] board = new int [row][column];

        /*
        System.out.println("Choose how you want to set the size of the array");
        System.out.println("1: Random size");
        System.out.println("2: Enter size");
        String menuNumber = sc.nextLine();
        switch (menuNumber) {
            case "1":
                RandomSizeArray();
                break;
            case "2":
                YourOwnSizeArray();
                break;
            default:
                System.out.println("Command not recognise");
        }
         */



        String n = Menu1();
        while(!n.equals("1") && !n.equals("2") && !n.equals("3")) {
            System.out.println("Command not recognise");
            n = Menu1();
        }
        switch (n) {
            case "1":
                RandomArray(board);
                printArray(board);
                break;
            case "2":
                YourOwnArray(board);
                break;
            case "3":
                break;
            default:
                System.out.println("Command not recognise");
        }
        String m;
        do {
            m = Menu2();
            switch (m) {
                case "1":
                    System.out.println("Min = " + minimumValue(board));
                    break;
                case "2":
                    System.out.println("Min = " + maximumValue(board));
                    break;
                case "3":
                    System.out.println("Average = " + AverageValue(board));
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Command not recognise");
            }
        }while(!m.equals("4"));
    }
    private static String Menu2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what you`d like to do");
        System.out.println("1: Find the minimum value");
        System.out.println("2: Find the maximum value");
        System.out.println("3: Find the average value of the array");
        System.out.println("4: Exit");

        String menuNumber2 = scanner.nextLine();
        scanner.close();

        return menuNumber2;
    }

    private static String Menu1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose how you want initialize the array!");
        System.out.println("1: Random numbers");
        System.out.println("2: Enter numbers");
        System.out.println("3: Exit");

        String menuNumber1 = scanner.nextLine();
        scanner.close();

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
                System.out.println();
            }
        sc.close();
        printArray(arr);
    }
    private static int[][] RandomArray(int[][] arr) {
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column; j++)
                arr[i][j] = random.nextInt(N);
        return arr;
    }
    /*private static void YourOwnSizeArray() {
        System.out.println("Max size of the array 20x20");
        System.out.print("Enter number of row: ");
        do {
            row = sc.nextInt();
            if(row > 20) {
                System.out.println("You entered wrong number");
                System.out.print("Enter number of row: ");
            }
        }while (row > 20);
        System.out.print("Enter number of column: ");
        do {
            column = sc.nextInt();
            if(column > 20) {
                System.out.println("You entered wrong number");
                System.out.print("Enter number of column: ");
            }
        }while (column > 20);
    }
    private static void RandomSizeArray() {
        row = random.nextInt(SIZE);
        column= random.nextInt(SIZE);
    }

     */
    private static void printArray(int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }


}