package dsa_foundational;

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr){
        int startIndex = 3;
        int lastIndex = arr.length - 3;
        while(startIndex < lastIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
    }
}
