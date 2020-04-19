package dev.generics;

import java.util.Stack;

public class SimpleParameterizeGenericTest<T> {
	
	T element;
	
	SimpleParameterizeGenericTest(T element){
		
		this.element=element;
	}
	
	  void printElement(){
		  Stack<Integer> s;
		 
		 System.out.println(element);
	 }
	
	   T returnEement(){
		  return element;
	  }
	  

	  public static void main(String args[]){
		  
		  SimpleParameterizeGenericTest<String> obj1= new SimpleParameterizeGenericTest<>("Hello");
		  obj1.printElement();
		  System.out.println("Return Value : "+obj1.returnEement());
		 
		  SimpleParameterizeGenericTest<Integer> obj2= new SimpleParameterizeGenericTest<>(100);
		  obj2.printElement();
		  System.out.println("Return Value : "+obj2.returnEement());
		  
		  SimpleParameterizeGenericTest<Employee> obj3= new SimpleParameterizeGenericTest<>(new Employee("DP001","Debasish","5000"));
		  obj3.printElement();
		  System.out.println("Return Value : "+obj3.returnEement());
	  }
	  
	  
	 static  class Employee{
		  
		  private String empId;
		  private String name;
		  private String sal;
		
		  public Employee(String empId, String name, String sal) {
			super();
			this.empId = empId;
			this.name = name;
			this.sal = sal;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
		}
		  
		  
	  }
	  
}
