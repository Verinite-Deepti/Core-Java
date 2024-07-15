package OOPs;

class Shape1 {
    public void area() {
        System.out.println("Displays area");
    }
}


class Triangle1 extends Shape1 {
    public void area(int h, int b) {
        System.out.println((1.0/2) * h * b);  
    }
}

class EquilaterialTriangle extends Triangle1 {
    public void area(int h, int b) {
        System.out.println((1.0/2) * h * b);  
    }
}


public class Inheritance_Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 t = new Triangle1();
        t.area(5, 10); 
        
        EquilaterialTriangle e=new EquilaterialTriangle();
        e.area(6,30);
	}

}
