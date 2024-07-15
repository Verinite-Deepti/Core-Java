package assignment;
import java.util.Scanner;
public class DecimaltoHexadecimalConversion {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int decimal;
	int remainder;
	String hexadecimal="";
	char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	System.out.print("Input a decimal no:");
	decimal=sc.nextInt();
	while(decimal>0) {
		remainder=decimal%16;
		hexadecimal=hex[remainder]+hexadecimal;
		decimal=decimal/16;
	}
	System.out.print("Hexadecimal value is:"+hexadecimal);
		}
		
	}
