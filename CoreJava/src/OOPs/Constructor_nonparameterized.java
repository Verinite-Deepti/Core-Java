package OOPs;


class Student1 {
String name;
int age;

public void printInfo() {
	System.out.println(this.name);
	System.out.println(this.age);
	
}


Student1(){
	System.out.println("Constructor called");
}

}
public class Constructor_nonparameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		s1.name="Deepti";
		s1.age=20;
		
		s1.printInfo();
	}

}
