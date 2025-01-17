package ishan.neetcode.dsa;

import java.util.Stack;

public class StackUtils {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();
        int a = 0;
        int b = 0;
        for(String token: tokens){
            switch(token){
                case "+":
                    a = result.pop();
                    b = result.pop();
                    result.push(a+b);
                    break;
                case "-":
                    a = result.pop();
                    b = result.pop();
                    result.push(a-b);
                    break;
                case "*":
                    a = result.pop();
                    b = result.pop();
                    result.push(a*b);
                    break;
                case "/":
                    a = result.pop();
                    b = result.pop();
                    result.push(b/a);
                    break;
                default:
                    result.push(Integer.parseInt(token));
                    break;
            }
        }
        return result.pop();
    }
}
