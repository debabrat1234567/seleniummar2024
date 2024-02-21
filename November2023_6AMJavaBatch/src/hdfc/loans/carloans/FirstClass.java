package hdfc.loans.carloans;

public class FirstClass 
{
	
	// data Properties
	int a=10, b=20, c;
	
	// Behaviours (methods)
	public void add()
	{
		c = a+b;
		System.out.println("Add of A & B is : " +  c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub of A & B is : " +  c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
	}

}
