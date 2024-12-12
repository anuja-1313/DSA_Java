package dsa_foundational;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchFloorValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();

        System.out.println("array elements");
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element: ");
        int k = sc.nextInt();

        System.out.println("Floor value: " + floorValue(arr, k));
    }
    public static int floorValue(int[] arr, int k){
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MIN_VALUE;

        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] == k){
                return k;
            } else if (arr[mid] < k) {
                ans = arr[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
