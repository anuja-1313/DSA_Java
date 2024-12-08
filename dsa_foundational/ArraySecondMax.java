package dsa_foundational;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondMax {

    public static int getSecLarg(int a[], int length){
        Arrays.sort(a);
        return a[length-2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n ;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Second Largest Element: "+ getSecLarg(a, n));

    }
}
