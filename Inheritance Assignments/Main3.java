abstract class Shape
{
	abstract void draw();
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("In Triangle draw function");
	}
}
class Poly extends Shape
{
	void draw()
	{
		System.out.println("In Poly draw function");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("In Circle draw function");
	}
}

public class Main3
{
    public static void main(String[]args)
    {
    	Shape arr[]={new Circle(),new Poly(),new Triangle()};
    	arr[0].draw();
    }
}
