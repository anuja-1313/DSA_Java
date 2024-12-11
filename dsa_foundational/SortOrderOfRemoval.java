package dsa_foundational;

import java.util.Arrays;
import java.util.Scanner;

public class SortOrderOfRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Total Cost :" + orderOfRemoval(arr));
    }

    public static int orderOfRemoval(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
        for(int i=0;i<n;i++){
            int temp = arr[i] * (n-i);
            ans = ans + temp;
        }
        return ans;
    }
}
