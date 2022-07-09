package pkg1;

public class Student 
{
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.age=20;
		obj.rollno=15;
		obj.display1();
		obj.display2();
		System.out.println(obj.age);
		System.out.println(obj.rollno);
		
		    
	}

}
