package day2;

public class Shape
{
	private int width,height;
	
	Shape()
	{
		this.width=0;
		this.height=0;
	}	
	Shape(int a,int b)
	{
		this.width=a;
		this.height=b;
	}
	
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public static void main(String args[])
	{
		Shape s= new Shape(100,20);
		Shape s1= new Shape(10,2000);
		
		System.out.println("Width is "+ s.getWidth());
		System.out.println("Height is "+ s1.getHeight());
	}

}
