package day2;

public class Demo {
	private int num=100;

	public static void main(String[] args) {
		Demo obj=new Demo();          //1.Obj is a reference created on STACK referring to object created on HEAP
		obj=new Demo();               //2.Here Obj will refer to new instance created and will not store the address of first 
		                              //object which was created in the first line i.e Demo obj=new Demo(); 
		Demo obj1=new Demo();

	}

}
