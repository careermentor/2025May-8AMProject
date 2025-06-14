package oopsConcept;

public class DemoEncap {

	private int age = 40;
	
	
	
	
	public int getAge()
	{
		System.out.println(age);
		return age;
	}




	public void setAge(int age) 
	{
		this.age = age;
	}




	public static void main(String[] args)
	{
	
		DemoEncap de = new DemoEncap();
		System.out.println(de.age);
		
		DemoStaticKeyword.printvalX();
	}

}
