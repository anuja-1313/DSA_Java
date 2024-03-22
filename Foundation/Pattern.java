import java.util.*;
public class Pattern{
    public static void main(String[] args){
        int n = 5;
        System.out.println("Enter value of n: ");
        // Scanner num = new Scanner(System.in);
        // n = num.nextInt();
        int nst = 1;
        int count = 1;

        for (int i = 1; i <= n ; i++){
            for (int j = 1; j<=nst; j++){
                System.out.print(count);
                count++;
            }
            nst++;
            System.out.println();
        }
    }
}