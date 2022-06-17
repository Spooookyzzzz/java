package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        //zad6();
    }

    private static void zad6() {
        char[] array = "3529".toCharArray();
        ArrayList<String> firstPartList = new ArrayList<>();
        ArrayList<String> secondPartList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    String str = Character.toString(array[i]) + Character.toString(array[j]);
                    int parsedInt = Integer.parseInt(str);
                    if(parsedInt < 60) {
                        secondPartList.add(str);

                        if (parsedInt < 24) {
                            firstPartList.add(str);
                        }
                    }
                }
            }
            Collections.sort(firstPartList);
            Collections.sort(secondPartList);
            String maxFirstNumber = Collections.max(firstPartList);
            String maxSecondNumber = Collections.max(secondPartList);
            System.out.println(maxFirstNumber);
            System.out.println(maxSecondNumber);
        }

        printList(firstPartList);
        printList(secondPartList);
    }

    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.print(s + "\t\t");
        }
        System.out.println();
    }

    private static void zad1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("The given string is empty!");
            return;
        }

        char[] textArray = text.toCharArray();
        char lastSymbol = textArray[textArray.length - 1];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (textArray[i] == lastSymbol) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void zad2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("The given string is empty!");
            return;
        }

        char[] textArray = text.trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(textArray[i]);
        }

        System.out.println(sb.toString());
    }

    private static void zad3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }

    private static void zad4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("The given string is empty!");
            return;
        }

        char[] textArray = text.trim().toCharArray();
        int count = 0;

        for (char ch : textArray) {
            if (Character.isDigit(ch)) {
                count += Character.digit(ch, 10);
            }
        }

        System.out.printf("Result : %d", count);
    }

    private static void zad5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("The given string is empty!");
            return;
        }

        char[] textArray = text.trim().toCharArray();
        int openBracketCount = 0;
        int closeBracketCount = 0;

        for (char ch : textArray) {
            if (ch == Character.valueOf('(')) {
                openBracketCount++;
            }
            if (ch == Character.valueOf(')')) {
                closeBracketCount++;
            }
        }

        if (openBracketCount == closeBracketCount) {
            System.out.println("OK");
        } else {
            System.out.println("Fade parentheses");
        }

    }
}