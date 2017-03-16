interface Moveable{
	default void move(){
		System.out.println("I can move");
	}
}

interface Rollable{

	default void roll(){
		System.out.println("I can roll");
	}
}

public class Q2 implements Moveable, Rollable{

	public void move(){
		System.out.println("I can move left and right !");
	}

	public void roll(){
		System.out.println("I can roll all the way round !");
	}

	public static void main(String args[]){
		Q2 qtwo = new Q2();
		System.out.println("\n THE MULTIPLE INHERITANCE PROGRAM\n CREATED BY REHNUMA TARANNUM\n");
		qtwo.move();
		qtwo.roll();

	}
}