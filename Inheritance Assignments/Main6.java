class base1
{ 
	private int num1;
	base1(int a)
	{
		this.num1=a;
		System.out.println("in base param");
	}
}
class sub1 extends base1
{
	private int num2,num3;
	sub1()
	{
		super(2);
		System.out.println("in def sub constr");
	}
	sub1(int a)
	{
		super(2);
		this.num2=a;
	}
	sub1(int a,int b)
	{
		super(2);
		this.num2=a;
		this.num3=b;
	}
	
}
public class Main6 
{
   public static void main(String[]args)
   {
	   sub1 s1=new sub1();
   }
}
