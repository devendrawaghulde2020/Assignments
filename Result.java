public class Result
{
	public static void main(String args[])
	{
		int percent=28;
		if(percent<35)
			System.out.println("Your result is Fail");
		else if(percent>35 && percent<55)
			System.out.println("Your result is Pass");
		else if(percent>55 && percent<65)
			System.out.println("Your result is Second class");
		else if(percent>65 && percent<75)
			System.out.println("Your result is First Class");
		else
			System.out.println("Your result is Distinction");
	}
}