package dsa_foundational;

import java.util.Scanner;

public class MaximumDiffTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements: ");
        for(int i =0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (((arr[i] - arr[j]) + (i - j)) > max) {
                    max = ((arr[i] - arr[j]) + (i - j));
                }
            }
        }

        System.out.println(max);
    }
}
