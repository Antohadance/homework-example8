package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        int year = 2020;
        printIsLeapYear(year);
        System.out.println();

        printRecommendApplicationVersion(1, 2020);
        System.out.println();
        System.out.println("Колличество дней для доставки = " + getDeliveryDistance(70));
        findAndPrintDuplicatesIfAny("aabccddefgghiijjkk");

        int[] arr = new int[]{3, 2, 1, 6, 5};
        int[] reversedArray = reverseArray(arr);
        System.out.println(Arrays.toString(reversedArray));
  //      System.out.println("reversed array: " + Arrays.toString(arr));
        System.out.println();

    }

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }

    //Задание №2
    public static void printRecommendApplicationVersion(int clientOs, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.println("Установите ");
        if (deviceIsOld) {
            System.out.println("lite ");
        }
        System.out.println("Версия для ");
        if (clientOs == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= deviceYear;
    }

    //Задание №3
    public static int getDeliveryDistance(int distance) {
        int daysNumber = 0;
        if (distance < 20) {
            daysNumber = daysNumber + 1;
        }
        if (distance >= 20 && distance < 60) {
            daysNumber = daysNumber + 2;
        }
        if (distance >= 60 && distance < 100) {
            daysNumber = daysNumber + 3;
        }
        return daysNumber;
    }
    //Задание №4
    public static void findAndPrintDuplicatesIfAny(String text) {
        char[] letters = text.toCharArray();
        boolean isDuplicateExists = false;
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                System.out.println("Найден дубль по символу " + letters[i]);
                isDuplicateExists = true;
                break;
            }
        }
        if (!isDuplicateExists) {
            System.out.println("Дублей не найдено ");
        }
        //Задание №5
    }
    public static int[] reverseArray(int[] arr){
        int[] copyArray = Arrays.copyOf(arr,arr.length);
        int leftIndex = 0;//5 4 1 7 9 8 2 ;
        int rightIndex = copyArray.length - 1;
        while (leftIndex < rightIndex){
            int temp = copyArray[leftIndex];
            copyArray[leftIndex] = copyArray[rightIndex];
            copyArray[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return copyArray;
    }
}
