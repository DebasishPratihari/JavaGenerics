package dev.generics;

public class Stack<T> {
	
	
	

	private Object elements[]=null;
	private int len=10;
	int top=-1;
	
	Stack(){
		elements=new Object[10];
		
	}
	
	void push(T  ele){
		if(top<len){
			
			elements[++top]=ele;
		}else{
			
			throw new StackException("Stack is full....!");
		}
		
	}
	
	T pop(){
		
		if(top==-1){
			
			throw new StackException("Stack is empty...!");
		}
		else{
			return (T)elements[top--];
		}
	}
	
	public static void main(String args[]){
		
		Stack<Integer> stack= new Stack<>();
		stack.push(10);
		stack.push(20);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		
		
	}

	
	

}
 class StackException extends RuntimeException {

	public StackException(String errMsg) {
		super(errMsg);
	}

}