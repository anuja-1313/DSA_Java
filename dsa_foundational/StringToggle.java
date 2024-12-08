package dsa_foundational;

import java.util.Scanner;

public class StringToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array length: ");
        int n = sc.nextInt();

        // Consume the leftover newline character after reading the integer
        sc.nextLine();

        System.out.println("array elements");
        char[] ch = new char[n];
        String st = sc.nextLine();

        for(int i=0; i<n; i++){
            ch[i] = st.charAt(i);
        }
        toggle(ch);
    }

    public static void toggle(char[] ch){
        int n = ch.length;
        for(int i =0; i<n ;i++){
            if(ch[i] >= 65 && ch[i] <= 90){
                ch[i] = (char)(ch[i] + 32);
            }
            else if (ch[i] >= 97 && ch[i] <= 122){
                ch[i]= (char)(ch[i] - 32);
            }
            System.out.print(ch[i] + " ");
        }
        System.out.println();
    }
}
