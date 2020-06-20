interface Game
{
	void play();
}
class Football implements Game
{
	public void play()
	{
		System.out.println("Playing Football");
	}
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("Playing Cricket");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("Playing Tennis");
	}
}
public class Main7
{
	public static void perform(Game ref)
	{
		ref.play();
	}
   public static void main(String[]args)
   {
	   perform(new Tennis());
   }
}
