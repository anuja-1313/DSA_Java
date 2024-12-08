package dsa_foundational;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements: ");
        for(int i =0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = arr[n-1] - arr[0];
        System.out.println(result);

    }
}
