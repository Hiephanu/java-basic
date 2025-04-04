package org.example.algo.binary_search;

public class BinarySearch {
    public static void search(int[] arr, int l, int r, int num) {
        if(l > r) {
            System.out.println("Not found");
            return;
        }
        int mid = l + (r - l )/ 2;
        if(arr[mid] == num) {
            System.out.println(mid);
            return;
        }
        if(arr[mid] > num) {
           search(arr, l , mid-1, num);
        }
        if(arr[mid] < num){
            search(arr, mid + 1 , r, num);
        }
    }

    public static int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = l + (r- l) /2;
            if(arr[mid] == target) {
                return  mid;
            }
            if(arr[mid] > target) {
                r= mid;
            } else {
                l= mid;
            }
        }
        return  0;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        System.out.println(search(arr, 7));
    }
}
