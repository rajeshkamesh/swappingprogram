package org.task;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	int x,y;
	System.out.println("Enter X and Y:  ");
	Scanner s = new Scanner(System.in);
	
	x=s.nextInt();
	y=s.nextInt();
System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
	
}
}
