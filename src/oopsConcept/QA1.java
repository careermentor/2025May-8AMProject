package oopsConcept;

public class QA1 {

	
	int x = 500;
	
	public  void sum(int a, int b)  //meth1
	{
		int c = a+b;
		
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sum(int a, int b, int c)
	{
		
		int d = a+b+c;
		
		System.out.println("sum of a&b&c: " + d);
		
	}
	
	public static void main(String[] args) {
		
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		q1.sum(20, 40.5f);
		q1.sum(20, 30, 40);
		

		DemoEncap de = new DemoEncap();
		//System.out.println(de.age);
		de.getAge();
	}

}
