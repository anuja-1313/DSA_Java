package dsa_foundational;

import java.util.Scanner;

public class BinarySearchUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length");
        int n = sc.nextInt();

        System.out.println("Array elements");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int unique = uniqueElement(arr);
        System.out.println(unique);
    }
    public static int uniqueElement(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        if(n==1){
            return arr[0];
        }

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }

            if(arr[mid] == arr[mid-1]){
                mid--;
            }

            if (mid % 2 == 0) {
                low = mid + 2;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
