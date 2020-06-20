class Parent1
{
	public void display1()
	{
		System.out.println("In parent1 display");
	}
}
interface Parent2
{
	 void display2();
}
class Child extends Parent1 implements Parent2
{
	public void display2()
	{
		System.out.println("In Child display method");
	}
}
public class Main5 
{
   public static void main(String[]args)
   {
	   Child c1=new Child();
	   c1.display1();
   }
}
