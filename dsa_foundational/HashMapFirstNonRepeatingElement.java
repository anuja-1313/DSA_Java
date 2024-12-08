package dsa_foundational;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapFirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("First non-repeating element: "+nonRepeatingElement(arr));

    }
    public static int nonRepeatingElement(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int temp = arr[i];
            if(map.containsKey(arr[i]) == true){
                map.put(arr[i], temp+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<n ;i++){
            if(map.get(arr[i]) == 1){
                return(arr[i]);
            }
        }

        return -1;
    }
}
