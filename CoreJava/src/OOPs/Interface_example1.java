package OOPs;

interface Animal1{
	void walk();
	
	
	}


class Horse1 implements Animal1{
	public void walk() {
		System.out.println("Horse walks on 4 legs");
		
	}
}


class Chicken1 implements Animal1{
	public void walk() {
		System.out.println("Chicken walks on 2 legs");
		
	}
}

public class Interface_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Horse1 horse=new Horse1();
horse.walk();
	}

}
