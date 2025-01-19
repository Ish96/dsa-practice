package ishan.neetcode.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackUtils {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));

        //Generate Valid Parenthesis
        generateParenthesis(3).forEach(System.out::println);
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

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        Stack<String> sol = new Stack<>();
        subTaskParentthesis(0,0,n, result, sol);
        return result;
    }

    public static void subTaskParentthesis(int openn, int closen, int n, ArrayList<String> result, Stack<String> sol){
        if((openn + closen) == 2*n){
            result.add(String.join("", sol));
            return;
        }

        if(n > openn){
            sol.push("(");
            subTaskParentthesis(openn+1, closen, n, result, sol);
            sol.pop();
        }

        if(openn > closen){
            sol.push(")");
            subTaskParentthesis(openn, closen+1, n, result, sol);
            sol.pop();
        }
    }
}
