package dsa_foundational;

import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        bitwiseEvenOdd(n);
    }
    public static void bitwiseEvenOdd(int n){
        if((n & 1) == 0){
            System.out.println(n + " is an EVEN Number!!");
        }
        else{
            System.out.println(n + " is an ODD Number!!");
        }
    }
}
