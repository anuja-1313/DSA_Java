package dsa_foundational;

import java.util.Arrays;
import java.util.Scanner;

public class SortGoodIntegerDuplicateElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("array elements");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Count of Good Integers: " + goodIntegers(arr));
    }

    public static int goodIntegers(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int less_count = 0; //taken when array contains duplicate elements

        if(arr[0]==0){
            count++;
        }

        for(int i=1; i<n;i++){
            if(arr[i] != arr[i-1]){
                less_count = i;
            }

            if(arr[i] == less_count){
                count++;
            }
        }

        return count;
    }
}
