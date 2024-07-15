package Patterns;
import java.util.*;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();


for(int i=1;i<=a;i++) {
	
	for(int j=1;j<=b;j++) {
		
		if(i==1 || j==1 || i==a || j==b ) {
			System.out.print("*");
		}
		else {
		
		System.out.print(" ");
	}
}
System.out.println();
	}

}
}