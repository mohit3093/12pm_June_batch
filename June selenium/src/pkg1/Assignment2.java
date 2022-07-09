package pkg1;

public class Assignment2
{
	public void m1()
	{   
		System.out.println("default method");
		this.m2();
	}
	
	public void m2()
	{
	System.out.println("one parametrized method");
	this.m3();
	}
    
	public void m3()
	{
	System.out.println("two parametrized method");
	this.m5();
	}
	
	public void m4()
	{
	System.out.println("three parametrized method");
	this.m1();
	}
	
	public void m5()
	{
	System.out.println("four parametrized method");
	}
	public static void main(String[] args) 
	{
		Assignment2 obj = new Assignment2();
		obj.m4();
				

	}

}
