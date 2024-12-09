package dsa_foundational;

import java.util.Scanner;

public class RecursionPrintTillN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        printing(n);
    }
    public static void printing(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        printing(n-1);
        System.out.println(n);
    }
}
