package org.example.sorting;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        insertionSort(numbers);
        System.out.println("\nAfter");
        printArray(numbers);
    };

    public static void insertionSort(int[] numbers) {
        for(int i=1;i<numbers.length;i++){
            int currentValue = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > currentValue) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentValue;
        }
    }

    public static void printArray(int [] numbers) {
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }

}
