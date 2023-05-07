package expression;
import java.util.Stack;

public class Expression {
	
	public static int calc(int a, int b, char operator) {
		switch(operator) {
		case '$': return (int)Math.pow(a,b);
		case '*': return a*b;
		case '/': return a/b;
		case '%': return a%b;
		case '-': return a-b;
		case '+': return a+b;
		}
		return 0;
	}

	private static int postfix(String postfix) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<postfix.length();i++) {
			char sym = postfix.charAt(i);
			
			if(Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
//				s.push(Integer.parseInt(String.valueOf(sym)));
			} else {
				int b = s.pop();
				int a = s.pop();
				int c = calc(a,b,sym);
				s.push(c);
			}
		}
		return s.pop();
	}
	
	public static int solvePrefix(String pre) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=pre.length()-1;i>=0;i--) {
			char sym = pre.charAt(i);
			
			if(Character.isDigit(sym)) {
				String operand = Character.toString(sym);
				s.push(Integer.parseInt(operand));
			} else {
				int a = s.pop();
				int b = s.pop();
				int c = calc(a,b,sym);
				s.push(c);
			}
		}
		return s.pop();
	}
	
	public static int pri(char operator) {
		switch(operator) {
		case '$': return 3;
		case '*': return 2;
		case '/': return 2;
		case '%': return 2;
		case '+': return 1;
		case '-': return 1;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix) {
		Stack<Character> s = new Stack<Character>();
		StringBuilder post = new StringBuilder();
		
		for(int i=0;i<infix.length();i++) {
			char sym = infix.charAt(i);
			if(Character.isDigit(sym))
				post.append(sym);
			else if(sym == '(')
				s.push(sym);
			else if(sym == ')') {
				while(s.peek() != '(')
					post.append(s.pop());
				
				s.pop();
			} else {
				while(!s.isEmpty() && pri(s.peek()) >= pri(sym)) {
					post.append(s.pop());
				}
				s.push(sym);
			}
		}
		
		while(!s.isEmpty())
			post.append(s.pop());
		
		return post.toString();
	}
	
	public static String infixToPrefix(String infix) {
		Stack<Character> s = new Stack<Character>();
		StringBuilder pre = new StringBuilder();
		
		for(int i = infix.length()-1; i >= 0; i--) {
			char sym = infix.charAt(i); 
			
			if(Character.isDigit(sym))
				pre.append(sym);
			else if(sym == ')') 
				s.push(sym);
			else if(sym == '(') { 
				while(s.peek() != ')')
					pre.append(s.pop());
				s.pop();
			} 
			else { 
				while(!s.isEmpty() && pri(s.peek()) > pri(sym)) {
					pre.append(s.pop());
				}
				s.push(sym);
			}		
		} 
		while(!s.isEmpty())
			pre.append(s.pop());
		return pre.reverse().toString();
	}
	
	public static boolean isBalanced(String expr) {
		Stack<Character> s = new Stack<Character>();
		String open = "([{", close = ")]}";
		
		for(int i=0;i<expr.length();i++) {
			char sym = expr.charAt(i);
			
			if(open.indexOf(sym) != -1)
				s.push(sym);
			else if(close.indexOf(sym) != -1) {
				if(s.empty())
					return false;
				
				char pop = s.pop();
				
				if(close.indexOf(sym) != open.indexOf(pop))
					return false;
			}
		}
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = ""; // "59+4862/-*-173-$+";
		String prefix = ""; // "+-+59*4-8/62$1-73";
	
//		postfix = infixToPostfix(infix);
//		System.out.println("Postfix: " + postfix);
//		int result = postfix(postfix);
//		System.out.println("Result: " + result);
//		prefix = infixToPrefix(infix);
//		System.out.println("Prefix: " + prefix);
//		result = solvePrefix(prefix);
//		System.out.println("Result: " + result);
		
//		String bal = "{[()]}";
		
//		boolean balanced = isBalanced(bal);
//		System.out.println("Balanced : " + balanced);
	}

}
