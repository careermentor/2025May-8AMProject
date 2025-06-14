package oopsConcept;

public class QA4 extends QA2 implements QA3I
{

	
	
	public void div(int a, int b)
	{
		int c = a/b;
		
		System.out.println("div" + c);
		
	}
	
	public static void main(String[] args) {
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		//q4.mul(20, 30);
		q4.sub(30, 40);  //QA2
		
		q4.sum(20, 30);  //QA1
		q4.qa3im();
		
		DemoStaticKeyword.printvalX();

	}

	
	public void qa3im() {
		System.out.println("QA3I method");
		
		
		
	}

}
