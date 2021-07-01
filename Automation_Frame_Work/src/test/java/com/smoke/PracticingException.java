package com.smoke;

public class PracticingException {
	static int a;
public static void main(String[] args) {
	System.out.println("Hi");
	try {
	System.out.println(10/a);}
	catch(Exception e) {
		e.printStackTrace();
	}finally {//always run
	//any connection close or quit goes here. this is optional thing	
	}
	
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//this is compile time exception/ checked exception
	System.out.println("Bye");
	
}
}
