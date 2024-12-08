package dsa_foundational;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetArrayDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        distinctElements(arr);
    }
    public static void distinctElements(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n ;i++){
            set.add(arr[i]);
        }
        System.out.println("Distinct Elements: " + set.size());
    }
}
