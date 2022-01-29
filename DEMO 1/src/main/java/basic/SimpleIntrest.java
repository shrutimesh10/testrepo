package basic;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float p, r, t;
		System.out.println("Enter the principal");
		p= sc.nextFloat();
		System.out.println("Enter the rate of interest");
		r= sc.nextFloat();
		System.out.println("Enter time period");
		t= sc.nextFloat();
		float SI;
		SI= (p*r*t)/100;
		System.out.println("SI is" +SI);
	}

}
