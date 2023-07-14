package org.example.sorting;

import java.util.Random;

public class Quicksort {

    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[10];

        for(int i=0; i<numbers.length;i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before:");
        printArray(numbers);
        quickSort(numbers,0,numbers.length-1);
        System.out.println("\nAfter");
        printArray(numbers);

    }

    public static void printArray(int [] numbers) {
        for (int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void quickSort(int [] numbers,int lowIndex,int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }
        //step 1 : choose pivot
        int pivot = numbers[highIndex];

        //step 2 : Do partitioning by moving values less than pivot to left
        //         and higher that pivot to the right

        // logic: After choosing the pivot (last element), create 2 pointers
        // left pointer (LP) and right pointer (RP) (leaving pivot aside)
        // LP = left most --- RP == right most
        // Now check if the LP is greater than pivot and check RP is less than pivot
        // if yes, the stop the LP and RP and swap the two
        // At some point, the LP anf RP will point to the same element
        // at that point swap the pointer with pivot
        // this will do the partitioning where number less than pivot are right
        // and numbers greater than pivot will be on right

        int leftPointer=lowIndex;
        int rightPointer=highIndex;
        while (leftPointer < rightPointer) {

            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer ++;
            }
            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer --;
            }
                swap(numbers,leftPointer,rightPointer);
        }
        swap(numbers,leftPointer,highIndex);

        quickSort(numbers,lowIndex,leftPointer-1);
        quickSort(numbers,leftPointer + 1,highIndex);
    }

    private static void swap(int[] array,int num1,int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
}
