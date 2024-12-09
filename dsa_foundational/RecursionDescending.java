package dsa_foundational;

import java.util.Scanner;

public class RecursionDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        desc(n);
    }
    public static void desc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        desc(n-1);
    }
}
