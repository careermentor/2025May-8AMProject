package firstPkg;

public class Calculations {
	
	
	public Calculations()
	{
		System.out.println("this is a constructor");
		int a = 50;
		int b = 60;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public Calculations(int a, int b)
	{
		System.out.println("this is a constructor");
		
		int c = a+b;
		System.out.println(c);
		
	}
	
	
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	
	
	//30,40,50
	
	
	//int x = 30+40
	//x+50
	
	
	public String addition()
	{
		int a = 20;
		int b = 30;
		
		int c = a+b;
		
		float d = 20.5f;
		
		String e = "Java";
		
		//System.out.println(c);  //50
		
		//System.out.println(a); //20
		
		//System.out.println(a+b);
		
		//System.out.println("a");  //a
		
		System.out.println("sum: " + c);  //sum: 50
		return e;
	}
	

	public static void main(String[] args) 
	{
		Calculations cal = new Calculations(30, 40);
		
		Calculations cal1 = new Calculations();
		
		//int x = cal.addition();
		
		//int x = cal.add(30, 40);
		//cal.add(x, 50);
		cal.add(40, 50);
		
		cal1.add(70, 80);
		cal1.addition();
		

	}

}
