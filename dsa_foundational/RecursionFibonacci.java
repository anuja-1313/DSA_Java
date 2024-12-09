package dsa_foundational;

import java.util.Scanner;

public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int n = sc.nextInt();

        System.out.println("Fibonacci of "+n+" is " +fib(n));
    }
    public static int  fib(int n){

        if(n==0 || n==1){
            return n;
        }

        int temp1 = fib(n-1);
        int temp2 = fib(n-2);
        return temp1 + temp2;
    }
}
