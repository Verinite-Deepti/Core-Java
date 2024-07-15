package assignment;

import java.util.Scanner;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int temp;
		System.out.print("Enter Elements in array: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
			 
				if(a[i]>a[j]) {
					temp=a[i];
							a[i]=a[j];
							a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}