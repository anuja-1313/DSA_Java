package dsa_foundational;

import java.util.Scanner;

public class TwoDArrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter rows: ");
        int r = sc.nextInt();
        System.out.println("enter columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements: ");
        for(int j=0; j<c; j++){
            for(int i=0; i<r ; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
;    }
}
