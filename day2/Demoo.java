package day2;

class A
{
	public int a=11;
	static int cnt1=1;
	public static int disp()
	{
		return cnt1;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}

class B
{
	public int b=22;
	static int cnt2=2;
	public static int disp()
	{
		return cnt2;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}	
	
	
}

 class C
 {
	 public int c=33;
	 static int cnt3=3;
	 public static int disp()
		{
			return cnt3;
		}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
		
	 
}
 
public class Demoo
{

	public static void main(String[] args)
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		System.out.println(A.disp());
        System.out.println(B.disp());
        System.out.println(C.disp());
        System.out.println(a1.getA());
        System.out.println(b1.getB());
        System.out.println(c1.getC());
	}

}
