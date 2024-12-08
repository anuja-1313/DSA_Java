package dsa_foundational;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter String");
        String str = sc.nextLine();

        System.out.println("Reversed String: "+ reverse(str));
        //reverse(str);
    }

    public static String reverse(String str){
        char[] ch = str.toCharArray();
        int n = str.length();

        int startPoint = 0;
        int endPoint = n-1;

        while(startPoint < endPoint){
            char temp = ch[startPoint];
            ch[startPoint] = ch[endPoint];
            ch[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
        //converting char array to String
        String ans = str.valueOf(ch);
        return ans;
    }
}
