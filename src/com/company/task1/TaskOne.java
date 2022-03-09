package com.company.task1;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(endlesslyInput());
    }

    private static int endlesslyInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input something");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Please input another something");
            }
        }
    }
}
