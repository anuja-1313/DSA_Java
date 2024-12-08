package dsa_foundational;

import java.util.Scanner;
public class IAndJSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum of pair:");
        int k = sc.nextInt();
        twoSum(arr, n, k);

    }

    public static boolean twoSum(int[] arr, int n, int k){

        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == k){
                    System.out.println("i & j elements: "+arr[i] + " ," + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
