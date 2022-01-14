package com.bridgelabz;

import java.util.Scanner;

public class LineComaprison {

	//variable for line points
	int x1,x2,y1,y2;
	
	//Scanner object for User Input
	Scanner sc = new Scanner(System.in);
	
	//Method to Get Input from User
	public void getLinePoint()
	{
		System.out.println("Enter the Value of x1 :");
		x1=sc.nextInt();
		
		System.out.println("Enter the Value of y1 :");
		y1=sc.nextInt();
	
		System.out.println("Enter the Value of x2 :");
		x2=sc.nextInt();
		
		System.out.println("Enter the Value of y2 :");
		y2=sc.nextInt();
	}
	//Method to Calculate Length of line
	public double getLengthOfLine() {
		double lengthofLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return lengthofLine;
	}
}
