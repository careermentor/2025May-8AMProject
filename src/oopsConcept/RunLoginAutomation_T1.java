package oopsConcept;

public class RunLoginAutomation_T1 extends LoginAutomation
{

	
	public void password() {
		
		System.out.println("pass1");
		
	}

	public static void main(String[] args) {
		
		RunLoginAutomation_T1 t1 = new RunLoginAutomation_T1();
		t1.username();
		t1.password();
		
	}
	
}
