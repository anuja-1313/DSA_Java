package dsa_foundational;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();

        System.out.println("array elements");
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int k = sc.nextInt();

        boolean result = binarySearch(arr, k);
        System.out.println(result);

    }
    public static boolean binarySearch(int[] arr, int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        Arrays.sort(arr);

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return true;
            }
            else if(arr[mid] > k){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
    }
}
