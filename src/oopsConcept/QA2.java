package oopsConcept;

public class QA2 extends QA1
{
	
	int x = 100;  //global
	
	public void valueX()
	{
		final int x = 200;  //local
		//x=300;
		
		System.out.println(x); //200
		
		System.out.println(this.x);
		
		System.out.println(super.x);
		
		super.sum(20, 30);
	}
	

	public void sum(int a, int b)  //meth1
	{
		int c = a*a+b*b;
		
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		
		System.out.println("sub of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		q2.valueX();
		q2.sum(20, 30);
	}

	
	public void qa1im() {
		System.out.println("method of QA1I");	
	}

}
