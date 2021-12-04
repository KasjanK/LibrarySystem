package com.company;

import java.util.Scanner;

public class Main {
    private Library library;

    static Scanner scanner = new Scanner(System.in);
    static boolean running = true;

    public static void main(String[] args) {
        Library library = new Library();

        while (running) {
            System.out.println("Enter 1 to show all books"
                             + "\nEnter 2 to search for a book"
                             + "\nEnter 3 to rate a book");

            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println(library.getAvailableBooks());
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}
