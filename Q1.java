/*	Java Training Assignment 2 
	Date 3/9/2017
	Organizer: Jeshal Mehta
	Participant : Rehnuma Taraannum
	tarannum.rehnuma@gmail.com
*/

class Animal {
	public void eat() {
    	System.out.println("Animals eat");
   	}
}

class Dog extends Animal {
	public void eat() {
   		// invokes the super class method
      	super.eat();   
    	//Overriding the base class method
      	System.out.println("Dogs eat meat"); 
   	}
}

public class Q1{
	public static void main(String args[]) {
		System.out.println("\n THE METHOD OVERRIDING PROGRAM\n CREATED BY REHNUMA TARANNUM\n");
		Dog d = new Dog();   
    	d.eat();
	}
}