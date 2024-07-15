package OOPs;

class Student2 {
String name;
int age;

public void printInfo() {
	System.out.println(this.name);
	System.out.println(this.age);
	
}

Student2(String name,int age){
	this.name=name;
	this.age=age;
}
}
public class Constructor_parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2("Deepti",20);
		
		s1.printInfo();
	

}
}
