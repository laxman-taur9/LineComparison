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
	// checking the Equality or smaller 2 length lines
	public static String comapreTo(double l1,double l2)
	{
		if(l1==l2)
		{
			return "Line1 and Line2 are Equal .";
			
		}
		else
		{
			if(l2>l2)
			{
				return "Line 1 is Bigger than Line 2";
			}
			else
			{
				return "Line 1 is smaller than line 2";
				
			}
		}
	}
}
