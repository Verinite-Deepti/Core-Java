package assignment;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int temp=a;
int r,sum=0;

while(a>0) {
	r=a%10;
	a=a/10;
	sum=sum + r*r*r;
	
}
		if(temp==sum) {
			System.out.println("Its an Armstrong no");
		}
			else {
				
			
				System.out.println("Its not an armstrong no");
		}
	}

}
