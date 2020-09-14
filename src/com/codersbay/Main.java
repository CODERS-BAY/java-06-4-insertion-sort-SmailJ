package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {19, 5, 220, 1, 78, 3, 15};
        System.out.println("No Insertion Sort");
        for (int greatestSortedElement : Arrays.stream(array).toArray()) {
            System.out.print(greatestSortedElement + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("With Insertion Sort");
        for (int i : Arrays.stream(array).toArray()) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int [] array) {
        for (int startOfUnsorted = 1; startOfUnsorted < array.length; startOfUnsorted++) {
            int nextUnsortedElement = array[startOfUnsorted];
            int i = startOfUnsorted - 1;
            while ((i > -1) && (array[i] > nextUnsortedElement)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = nextUnsortedElement;
        }

    }

}