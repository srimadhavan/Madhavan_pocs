package com.java8.test;

import java.util.ArrayList;
import java.util.List;

public class MethodRefernce {

	
	//Passing Method refernce to another method
	// in this we are passing println method to foreach List method
		public static void main(String args[]){
		      List names = new ArrayList();
				
		      names.add("Mahesh");
		      names.add("Suresh");
		      names.add("Ramesh");
		      names.add("Naresh");
		      names.add("Kalpesh");
		      names.forEach(System.out::println);
		      
		}
}
