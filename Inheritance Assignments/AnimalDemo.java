
class Animal
{ 
	void makeSound()
	{}
}

 class Dog extends Animal
 {
	 void makeSound()
	 {
		 System.out.println("in Dog Sound");
	 }
 }
 class Cat extends Animal
 {
	 void makeSound()
	 {
		 System.out.println("in Cat Sound");
	 }
 }

 class Tiger extends Animal
 {
	 void makeSound()
	 {
		 System.out.println("in Dog Sound");
	 }
	 void hunting()
	 {
		 System.out.println("In Tiger Hunting");
	 }
 }
 
 public class AnimalDemo
 {
	 static void perform(Animal ref)
	 {
		 if(ref instanceof Tiger)
		 {
			 Tiger t=(Tiger)ref;
			 t.hunting();
		 }
		 ref.makeSound();
	 }
	 public static void main(String args[])
	 {
	 perform(new Tiger());
	 perform(new Cat());
	 }
 }