
 class Vehicle
{
    public void start()
    {
    	System.out.println("In Vehicle start");
    }
}
 class Fourwheeler extends Vehicle
 {
	 public void start()
	 {
		 System.out.println("In Fourwheeler start");
	 }
 }

 public class Main
 {
	 public static void main(String[]args)
	 {
	 Fourwheeler f1=new Fourwheeler();
	 f1.start();
	 }
 }