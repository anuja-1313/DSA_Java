package dsa_foundational;

import java.util.Scanner;

public class ArrayFrquencyOfelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length for arr1 & arr2:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Arr1 :");
        int[] arr1 = new int[n];
        for(int i =0; i<n ;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Arr2 :");
        int[] arr2 = new int[m];
        for(int i=0; i<m ;i++){
            arr2[i] = sc.nextInt();
        }

        frequency(arr1, arr2);
    }

    public static void frequency(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        for(int i=0;i<n;i++){
            int value = arr1[i];
            int count = 0;
            for(int j=0; j<m; j++){
                if(arr2[j] == value){
                    count++;
                }
            }
            System.out.println(arr1[i] + " : " + count);
        }
    }
}
