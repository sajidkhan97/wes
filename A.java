class A 
{
	static
	{
		System.out.println("i'm static ");
	}
	{
		System.out.println("i am non static");
	}
}
class Program0
{
	static
	{
		System.out.println("i am inside static block of program0");
	}
	{
		System.out.println("i am inside non static block of program0");
	}
		

	public static void main(String[] args)
	{
		System.out.println("hello");
		new A();
		new program0();

	}
}
	



	