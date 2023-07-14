package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //3,4,6,7,8,10,13,9,1
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(10);
        arr.add(13);
        arr.add(9);
        arr.add(1);




        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) % 2 != 0) {
                arr.remove(i);
                i=0;
            }
        }
        System.out.println(arr);
    }
}