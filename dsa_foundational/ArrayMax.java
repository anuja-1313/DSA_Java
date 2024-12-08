package dsa_foundational;

import java.util.Scanner;
public class ArrayMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i=0; i<n ;i++){
            if(arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
            else if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
        }
        System.out.println("Largest element: "+ max);
// FINDING SECOND-LARGEST NUMBER
        System.out.println("Second Largest element: "+secmax);

    }
}
