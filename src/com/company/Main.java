package com.company;

public class Main {

    private static int findMaxIndex(int[] arr, int lo, int hi) {
        int mid = (hi - lo)/2 + lo;
        if (lo > 0 && hi < arr.length - 1 && arr[mid - 1] <= arr[mid] && arr[mid + 1] <= arr[mid]) return mid;
        if (lo == hi) return -1;

        int left = findMaxIndex(arr,mid + 1, hi);
        int right = findMaxIndex(arr, lo, mid);
        return left > right ? left : right;
    }

    private static int binSearch (int[] arr, int start, int end, int n) {
        while(start < end) {
            int mid = (end - start)/2 + start;
            if (arr[mid] == n) return mid;
            if(arr[mid] < n) start++;
            else end--;
        }
        return -1;
    }

    private static int searchInBitonic (int[] arr, int n) {
        int max = findMaxIndex(arr, 0, arr.length - 1);
        System.out.println(max);
        if (max < 0)
            return binSearch(arr, 0, arr.length - 1, n) ;
        int left = binSearch(arr, 0, max, n);
        int right = binSearch(arr, max + 1, arr.length - 1, n);
        return left > right ? left : right;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,7,9,12,13,15,18,23,30,22,20,17,3,1};
        int n = 10;

        System.out.println(searchInBitonic(arr, 13));
    }
}
