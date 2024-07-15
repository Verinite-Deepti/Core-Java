package OOPs;

class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1.0/2) * h * b);  
    }
}

public class Inheritance_Single {
    public static void main(String[] args) {
    
        Triangle t = new Triangle();
        t.area(5, 10);  
    }
}
