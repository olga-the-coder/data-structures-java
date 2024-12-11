package org.example.arrays;

import java.util.Arrays;

public class ArraysPractice {
    /*  random() method returns a random number between 0.0 and 0.9..., you multiply it by 100,
        so upper limit becomes 0.0 to 99.999... when you add 1, it becomes 1.0 to 100.999...,
       now when you truncate to int, you get 1 to 100 */
    public static int[] createRandomArray() {
        int[] arr = new int[10];
        int min = 1;
        int max = 100;
        int range = max - min + 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range + 1);
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void largestSmallestInArray(int[] arr) {
        System.out.print("Original Array: ");
        printArray(arr);

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                continue;
            }
        }

        int min = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
            }  else {
                continue;
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(createRandomArray()));
        //printArray(createRandomArray());
        largestSmallestInArray(createRandomArray());
    }
}