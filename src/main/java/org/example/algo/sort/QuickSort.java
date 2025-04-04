package org.example.algo.sort;

//2 3 1 5 2 7
public class QuickSort {

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r); // Đưa pivot vào vị trí đúng
        return i + 1;
    }

    public static void quicksort(int[] arr, int l, int r) {
        if (l < r) { // Điều kiện dừng
            int pivot = partition(arr, l, r);
            quicksort(arr, l, pivot - 1);
            quicksort(arr, pivot + 1, r);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
