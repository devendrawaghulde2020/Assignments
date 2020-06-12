package day2;

class AA
{
	static
	{
		System.out.println("Inside AA static Block");
	}
}

class BB
{
	static
	{
		System.out.println("Inside BB static Block");
	}
		
}

 class CC
{
	 static
		{
			System.out.println("Inside CC static Block");
		}
	 public static void disp()
	 {
		 
	 }
}
 
public class Demolast
{
	static
	{
		System.out.println("Inside Demolast static Block");
	}

	public static void main(String[] args)
	{
		System.out.println("Inside Main");        
		AA a =new AA();                        //STATIC Blocks of classes are only invoked when an instance of that class is created or any function of that class is invoked
		BB b=new BB();
		CC.disp();
		
	}

}

