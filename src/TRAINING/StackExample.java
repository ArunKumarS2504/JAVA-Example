package TRAINING;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack =new Stack<Integer>();
		stack.push(10);
		stack.push(21);
		stack.push(23);
		stack.push(13);
		
		System.out.println(stack);
		
		
		int remove=stack.pop();
		
		System.out.println("removed value " +remove);
	//	System.out.println("Updated Stack"+stack);
		
		//stack.clear();
		//stack.empty();
		//stack.clone();
		stack.empty();
		
		System.out.println(stack);

	}

}
