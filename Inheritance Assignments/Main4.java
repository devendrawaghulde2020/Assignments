interface A
{
	void disp1();
}
interface B extends  A
{
	void disp2();
}
class C implements A,B
{
	public void disp1()
	{
		System.out.println("In class Disp1 method");
	}
	public void disp2()
	{
		System.out.println("In class Disp2 method");
	}
	
}
public class Main4
{
   public static void main(String []args)
   {
	  C c1=new C();
	  c1.disp1();
   }
}
