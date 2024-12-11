package dsa_foundational;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){

            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        //print sorted array
        for(int i=0;i<n;i++){
            System.out.print(" " + arr[i]);
        }
    }
}
