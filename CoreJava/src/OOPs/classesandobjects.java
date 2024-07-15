package OOPs;



class Student{
	String name;
	int age;
	
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
}
public class classesandobjects {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.name="Deepti";
		s1.age=20;
		
		s1.printInfo();
		
		
		
	}

}
