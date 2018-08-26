package leetcode;

import java.util.Stack;
/**
 * @program: PlayWithDataStructure
 * @description: 括号的匹配
 * @author: botao
 * @create: 2018-08-26 08:42
 **/
public class VaildParentheses {

    public boolean isVaild(String inputStr) {
        Stack<Character> stack = new Stack<>();
        char[] chars = inputStr.toCharArray();
        for (char c : chars) {
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                char topChar = stack.pop();
                if(c == ')' && topChar != '(')
                    return false;
                if(c == ']' && topChar != '[')
                    return false;
                if(c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
