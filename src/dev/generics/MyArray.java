package dev.generics;

import java.util.Arrays;

public class MyArray<E> {
	
	private final E[] arr;
	public final int length;
	
	
	public MyArray(Class<E> type, int length) {
		super();
		this.arr = (E[])java.lang.reflect.Array.newInstance(type,length);
		this.length = length;
	}
	
	
	E get(int i){
		return arr[i];
	}
	
	void set(int i,E e){
		
		arr[i]=e;
	}


	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
	public static void main(String args[]){
		
		final int len=5;
		MyArray<Integer> arr=new MyArray(Integer.class,len);
		
		for(int i=0;i<5;i++)
			arr.set(i, i+1);
		
		System.out.println(arr);
	}

}
