package basics;

public class StringConcatenation {
	
	//concat means add 2 things
	public  static void main(String args[]) {
	int a = 100;
	int b =200;
	
	String s = "Swathi ";
	String s1 = "Hello";
	
	
	System.out.println(s+s1);
	System.out.println(a+b);
	System.out.println(a+s1);
	System.out.println(a+b+s);
	System.out.println(s+s1+a+b);//Swathi Hello100200
	System.out.println(s+s1+(a+b));//Swathi Hello300
	
	System.out.println("\"Never Give Up\"");
	}
} 

//Swathi Hello
//300
//100Hello
//300Swathi 
//Swathi Hello100200