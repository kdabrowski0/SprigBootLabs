package com.ug.zad.springlab04zad02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("quickSort")
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        quicksort(array, 0, array.length - 1);
        return array;
    }

    private void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quicksort(array, low, partitionIndex - 1);
            quicksort(array, partitionIndex + 1, high);
        }
    }
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}