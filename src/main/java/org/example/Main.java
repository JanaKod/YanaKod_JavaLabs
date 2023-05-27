package org.example;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final StudentSettings settings = new StudentSettings();
    public static void main(String[] args) throws DatabaseExcep {

        /**Головне меню*/
        int userChose;
        do {
            printMenu();
            userChose = SCANNER.nextInt();

            switch (userChose) {
                case 0 -> System.out.println("\nGood bye!");
                case 1 -> printAllStudents();
                case 2 -> searchLastName();
                case 3 -> searchBirthDate();
                default -> System.out.println("You entered wrong number! Try again!");
            }
        } while (userChose != 0);
    }

    /**Вивід меню*/
    private static void printMenu() {
        System.out.println("\nPlease chose possible options:\n" +
                "1. See all students\n" +
                "2. Find students by last name\n" +
                "3. Find students by birth date(from-to)\n" +
                "0. Exit");
    }

    /**Вивід студентів з БД*/
    private static void printAllStudents() throws DatabaseExcep {
        List<Student> result = settings.getAllStudent();
        System.out.println("All students from database: ");
        result.forEach(System.out::println);
    }

    /**Пошук студентів за прізвищем*/
    private static void searchLastName() throws DatabaseExcep {
        System.out.println("Write last name for search: ");
        String lastName = SCANNER.nextLine();
        if (lastName.isBlank()) {
            System.out.println("Last name field cannot be empty. Please try again");
            searchLastName();
        } else {
            List<Student> result = settings.getByLastName(lastName);

            if (result.isEmpty()) {
                System.out.println("There are no studentswith such last name in database");
            } else {
                System.out.println("Result of search:");
                result.forEach(System.out::println);
            }
        }
    }

    /**Пошук студентів за датою народження*/
    private static void searchBirthDate() throws DatabaseExcep {
        SCANNER.nextLine(); // перехід на новий рядок, щоб запобігти збою в зчитуванні даних з консолі

        System.out.println("Write start date to search in format yyyy-mm-dd: ");
        String fromDate = SCANNER.nextLine();
        System.out.println("Write end date to search in format yyyy-mm-dd: ");
        String toDate = SCANNER.nextLine();
        if (fromDate.isBlank() || toDate.isBlank()) {
            System.out.println("Birth date field cannot be empty. Please try again");
            searchBirthDate();
        } else {
            List<Student> result = settings.getByBirthDate(Date.valueOf(fromDate), Date.valueOf(toDate));

            if (result.isEmpty()) {
                System.out.println("There are no students with birth dates from this period in database");
            } else {
                System.out.println("Result of search:");
                result.forEach(System.out::println);
            }
        }
    }
}
