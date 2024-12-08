package dsa_foundational;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapArrayFrequencyOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("array length");
        int n = sc.nextInt();
        System.out.println("array elements");
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Queries array length:");
        int m = sc.nextInt();
        System.out.println("Query array values:");
        int[] queryarr = new int[m];
        for(int i=0; i<m;i++){
            queryarr[i] = sc.nextInt();
        }

        frequency(arr, queryarr);

    }
    public static void frequency(int[] arr, int[] queryarr){
        int n = arr.length;
        int m = queryarr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n ; i++){
            if(map.containsKey(arr[i]) == true){
                int temp = map.get(arr[i]);
                map.put(arr[i], temp+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<m; i++){
            int value = queryarr[i];
            if(map.containsKey(queryarr[i]) == true){
                System.out.println(queryarr[i]+ " : " +map.get(value));
            }
            else{
                System.out.println(queryarr[i] + " : 0");
            }
        }

    }
}
