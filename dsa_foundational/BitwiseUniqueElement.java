package dsa_foundational;

import java.util.Scanner;

public class BitwiseUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique element: " + uniqueElement(arr));


    }
    public static int uniqueElement(int[] arr){
        int ans =0;
        int n = arr.length;
        for(int i=0; i<n;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
