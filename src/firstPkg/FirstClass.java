package firstPkg;

import oopsConcept.DemoEncap;
import secondPkg.SecondClass;

public class FirstClass
{
	
	
	int a=10;
	

	
	float b=10.5f;
	char c='X';
	String d = "Java";
	boolean e = true;
	
	
	
	 void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	 public void sum()
	{
		 int a = 20;
		
		a=30;
		
		int b = 30;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		
		FirstClass abc = new FirstClass();
		
		abc.printvalues();
		abc.sum();
		
		SecondClass sc = new SecondClass();
		sc.main(args);
		
		
		
	}
	
	
}
