package org.example.sorting;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);
        System.out.println("\nAfter");
        printArray(numbers);


    }

    public static void mergeSort(int [] numbers) {
        int inputLength = numbers.length;

        if(inputLength < 2){
            return;
        }

        int midIndex = numbers.length/2;
        int[] leftHalf = new int[midIndex];
        int [] rightHalf = new int[inputLength - midIndex];

        for(int i=0; i<midIndex;i++) {
            leftHalf[i] = numbers[i];
        }

        for(int i=midIndex;i<(inputLength);i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(numbers,leftHalf,rightHalf);

    }

    public static void merge(int[] numbers,int[] leftHalf,int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0;
        int j=0;
        int k=0 ;

        while (i < leftSize && j <rightSize) {
            if(leftHalf[i] <= rightHalf[j]) {
                numbers[k]= leftHalf[i];
                i++;
            }
            else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i<leftSize) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int [] numbers) {
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }
}
