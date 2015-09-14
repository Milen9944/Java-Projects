import java.util.Scanner;
import java.util.Stack;

public class CheckForBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an expression: ");
		String exp = input.nextLine();
		check(exp);
		input.close();

	}
	public static void check(String string) {
		Stack<Character> stack = new Stack<Character>();
		char[] expression = string.toCharArray();
		boolean wrong = false;
		for (int i = 0; i < expression.length; i++) {
			if (expression[i] == '(') {
				stack.push(expression[i]);
			} else if (expression[i] == ')') {
				if (!stack.isEmpty()) {
					expression[i] = stack.pop();
				}
				if (expression[i] != '(') {
					wrong = true;
					break;
				}
			}
		}
		if ((wrong) || (!stack.isEmpty())) {
			System.out.println("This expression has unbalanced parentheses!");
		} else {
			System.out.println("this expression has balanced parentheses!");
		}
	}


}
