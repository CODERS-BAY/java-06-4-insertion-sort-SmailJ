package com.codersbay;

public class Main {

    public static void main(String[] args) {

        int[] array = {19, 5, 220, 1, 78, 3, 15};
        System.out.println("No Insertion Sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(array);

        System.out.println("With Insertion Sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int array[]) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }

    }

}