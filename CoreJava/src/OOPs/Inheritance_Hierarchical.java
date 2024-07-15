package OOPs;

class Shape2 {
    public void area() {
        System.out.println("Displays area");
    }
}


class Triangle2 extends Shape2 {
    public void area(int h, int b) {
        System.out.println((1.0/2) * h * b);  
    }
}

class Circle extends Shape2 {
    public void area(int r) {
        System.out.println((3.14) * r * r);  
    }
}
public class Inheritance_Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 t = new Triangle1();
        t.area(5, 10); 
        
        Circle c=new Circle();
        c.area(20);
	}

}
