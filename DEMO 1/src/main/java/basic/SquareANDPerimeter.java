package basic;

import java.util.Scanner;

public class SquareANDPerimeter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    Float a ,l,w;
	    System.out.println("enter the value of area");
	    a= sc.nextFloat();
	    System.out.println("enter the lenght");
	    l= sc.nextFloat();
	    System.out.println("enter the width");
	    w= sc.nextFloat();
	    
	    Float Square, Rectangle;
	    Square= a*a;
	    System.out.println("area of square is" +Square);
	    Square=  4*a;
	    System.out.println("perimeter of square is" +Square);
	    Rectangle= l*w;
	    System.out.println("area of rectangle" +Rectangle);
	    Rectangle= 2*(l*w);
	    System.out.println("perimeter of Rectangle" +Rectangle);
	    
	    
	   
	    
	  
		
		// TODO Auto-generated method stub

	}

}
