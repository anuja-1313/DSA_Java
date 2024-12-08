package dsa_foundational;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTwosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array length:");
        int n = sc.nextInt();

        System.out.println("array elements:");
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter sum value:");
        int k = sc.nextInt();

        //System.out.println(twoSum(arr, k));
        twoSum(arr, k);
    }
    public static void twoSum(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]) == true){
                int temp = map.get(arr[i]);
                map.put(arr[i], temp+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(int i=0; i<n;i++){
            int a = arr[i];
            int b = k-a;
            if((a!=b) && map.containsKey(b) == true){
                System.out.println("Pair found : "+ a + ", " + b);
                return;
            }
            else if((a==b) && map.containsKey(b)== true && map.get(b) > 1){
                System.out.println("Pair found : "+ a + ", " + b);
                return;
            }
        }
        System.out.println("No pair found!!!");;
    }
}
