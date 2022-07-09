package pkg1;

public class Assignment 
{
	public int div(int a, int b)
	{
		int c;
		c=a/b;
	    System.out.println("div result is "+ c);
	    return c;
	}
	public int sub(int x1, int x2)
	{
		int x3;
		 x3 = x1-x2;
		 System.out.println("sub result is "+ x3);
		 return x3;	
	}
	public int add(int y1, int y2)
	{
		int y3;
		y3=y1+y2;
		System.out.println("add result is "+ y3);
		return y3;		
	}
	public void multi(int z1, int z2)
	{
		int z3;
		z3=z1*z2;
		System.out.println("multi result is "+z3);
	}
	
	public static void main(String[] args) 
	{
	  Assignment obj=new Assignment();
	  int result1=obj.div(10, 2);
	  int result2=obj.sub(result1, 2);
	  int result3=obj.sub(result2, 2);
      int result4=obj.add(result3, 2);
      obj.multi(result4, 2);
      
			  
	  
	  
	}

}
