package ch15;

import object.Stack;

public class dam {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String s = new String("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
		char [] ch = s.toCharArray();
		for (int i = 0; i < ch.length;i++) 
		{
			switch(ch[i])
			{
			case '+':stack.push(ch[++i]);break;
			case '-':System.out.print(stack.pop());break;
			}
		}
	
	}
}
