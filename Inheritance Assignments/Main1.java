class P  
{
  P()
  {
	  System.out.println("In parent constr");
  }
}
class C1 extends P 
{
  C1()
  {
	  System.out.println("In Child 1 constr");
  }
}
class C2 extends P
{
  C2()
  {
	  System.out.println("In Child 2 constr");
  }
}

class Main1
{
	public static void main(String []args)
	{
		C2 p1=new C2();
	}
}
