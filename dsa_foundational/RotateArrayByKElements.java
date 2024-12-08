package dsa_foundational;

import java.util.Scanner;
public class RotateArrayByKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int k = sc.nextInt();
        k = k % n;
        rotate(arr, 0, n-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);
        System.out.println("Rotated array: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void rotate(int[] arr, int start, int end){
        int startIndex = start;
        int endIndex = end;
        while(startIndex < endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}




