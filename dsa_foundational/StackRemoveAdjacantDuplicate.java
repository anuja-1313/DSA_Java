package dsa_foundational;

import java.util.Scanner;
import java.util.Stack;

public class StackRemoveAdjacantDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "adcbbccaacded";
        String s = "abbbbd";

        System.out.println("String after removing adjacent elements: " + removeAdjacent(s));
    }

    public static String removeAdjacent(String s){
        //initializing a stack to store String elements
        Stack<Character> stack = new Stack<>();

        /*
        if stack is empty - push the first element
        else if - stack top matches current new elements, pop stack top
        else - push current new element into stack
         */
        for(int i=0; i<s.length(); i++){
            if(stack.size() == 0){
                stack.push(s.charAt(i));
            }
            else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        //initialising a character array to store the result of above
        //in LIFO order
        char[] arr = new char[stack.size()];
        for(int i= arr.length-1 ; i>=0; i--){
            arr[i] = stack.pop();
        }

        //Converting character array to String and returning the final answer
        String ans = s.valueOf(arr);
        //String ans = new String(arr);   //more memory overhead
        return ans;

    }
}
