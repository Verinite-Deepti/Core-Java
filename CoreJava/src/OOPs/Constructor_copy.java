package OOPs;

class Student_New {
	String name;
	int age;
	
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		
	}
	
	 Student_New (Student_New s2){
		this.name=s2.name;
		this.age=s2.age;
		
	}

	 Student_New () {
		// TODO Auto-generated constructor stub
	}
}


public class Constructor_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_New s1=new Student_New();
s1.name="Deepti";
s1.age=24;
Student_New s2=new Student_New(s1);
s2.printInfo();
	}

}
