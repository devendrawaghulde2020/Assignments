class Top1
{
	public void disp()
	{
		System.out.println("Inside Top class function");
	}
}
class Bottom1 extends Top1
{
	public void disp()
	{
		System.out.println("Inside Bottom1 class function");
	}
}
class Bottom2 extends Top1
{
	public void disp()
	{
		System.out.println("Inside Bottom2 class function");
	}
}
class Bottom3 extends Top1
{
	public void disp()
	{
		System.out.println("Inside Bottom3 class function");
	}
}

public class Main2 
{
    public static void main(String[]args)
    {
    	Top1 t1=new Bottom2();
    	t1.disp();
    }
}
