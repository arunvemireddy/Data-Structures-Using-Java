package Stack;

import java.util.Stack;

public class ClosingBraces {
	static Boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		for(Character c:expression.toCharArray()) {
			if(c == '{' || c =='(' || c == '[' ) {
				stack.push(c);
			}else if(c == '}' || c ==')' || c == ']' ){
				 if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
	                    return false;
	                }
			}
		}
		return stack.isEmpty();
	}
	
	static Boolean isMatchingPair(char open,char close) {
		  return (open == '{' && close == '}') || (open == '[' && close == ']') || (open == '(' && close == ')');
    }
	

	public static void main(String[] args) {
		
		String expression = "[{()}]";
		boolean result = isBalanced(expression);
		if (result) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
	}
}
