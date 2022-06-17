package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEncodedTime("9912"));
        System.out.println(getEncodedTime("3571"));
        System.out.println(getEncodedTime("9988"));
        System.out.println(getEncodedTime("1222"));
    }

    private static String getEncodedTime(String inputString) {
        char[] array = inputString.toCharArray();
        LinkedList<String> firstPartList = new LinkedList<>();
        LinkedList<String> secondPartList = new LinkedList<>();

        generateValidCombinations(array, firstPartList, secondPartList);
        firstPartList.sort(Collections.reverseOrder());
        secondPartList.sort(Collections.reverseOrder());

        for (String s : firstPartList) {
            List<Character> remainChars = getRemainChars(s, inputString);
            if (!getCombination(remainChars).isEmpty()) {
                String str = Collections.max(getCombination(remainChars));
                return s + ":" + str;
            }
        }
        return "Wrong number! Can't build time string";
    }

    private static void generateValidCombinations(char[] array, List<String> firstPartList, List<String> secondPartList) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    String str = Character.toString(array[i]) + array[j];
                    if (!firstPartList.contains(str) && Integer.parseInt(str) < 24) {
                        firstPartList.add(str);
                    }
                    if ((!secondPartList.contains(str) && Integer.parseInt(str) < 60)) {
                        secondPartList.add(str);
                    }
                }
            }
        }
    }

    private static List<String> getCombination(List<Character> list) {
        LinkedList<String> resultList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    String str = Character.toString(list.get(i)) + list.get(j);
                    if (Integer.parseInt(str) < 60) {
                        resultList.add(str);
                    }
                }
            }
        }
        return resultList;
    }

    private static List<Character> getRemainChars(String string, String inputString) {
        char[] inputArr = string.toCharArray();
        String s1 = inputString.replaceFirst(String.valueOf(inputArr[0]), "X");
        String s2 = s1.replaceFirst(String.valueOf(inputArr[1]), "X");
        return returnRemainChars(s2);
    }

    private static List<Character> returnRemainChars(String string) {
        LinkedList<Character> list = new LinkedList<>();
        char[] arr = string.toCharArray();
        for (char ch : arr) {
            if (ch != 'X') {
                list.add(ch);
            }
        }
        return list;
    }
}
