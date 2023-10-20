package Leetcode75;

import java.util.Stack;
public class Validparentheses {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char x = s.charAt(i);

                if(x == '(' || x == '{' || x == '[' ){

                    stack.push(x);
                    continue;
                }

                if(stack.isEmpty()){
                    return false;
                }

                char stackpop = stack.pop();

                if(x == ')' && stackpop != '(')
                    return false;

                if(x == '}' && stackpop != '{')
                    return false;

                if(x == ']' && stackpop != '[')
                    return false;


            }
            return stack.isEmpty() ? true : false;
        }

}
