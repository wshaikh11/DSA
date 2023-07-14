package org.example.sorting;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        selectionSort(numbers);
        System.out.println("\nAfter");
        printArray(numbers);
    }

    public static void selectionSort(int [] numbers) {
        int length = numbers.length;
        for(int i=0;i<length-1;i++){
            int min = numbers[i];
            int indexOfMin = i;
            for(int j=i+1;j<length;j++) {
                if(numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers,i,indexOfMin);

        }
    }

    public static void swap(int [] numbers,int num1,int num2){
        int temp = numbers[num1];
        numbers[num1] = numbers[num2];
        numbers[num2] = temp;
    }


    public static void printArray(int [] numbers) {
        for (int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }

}
