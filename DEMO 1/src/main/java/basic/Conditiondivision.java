package basic;

import java.util.Scanner;

public class Conditiondivision {
public static void main(String[] args) {
		
		int num;
		System.out.println("enter the number");
		
		Scanner sc=new Scanner(System.in);
		num= sc.nextInt();
		if(num% 5==0)
		   System.out.println("number is divisible");
	   else
		   System.out.println("number is not divisible");
	}


}



