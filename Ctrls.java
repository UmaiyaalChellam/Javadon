package condn;

import java.util.Scanner;

public class Ctrls {
	public static void main(String[] args) 
	{
     System.out.println("Enter the Number:");
     Scanner s= new Scanner(System.in);
     int num = s.nextInt();
     if(num>0)
     {
    	 System.out.println("The Given number is positive");
     }
     else if (num < 0)
     {
    	 System.out.println("The Given number is negative");
     }
     else 
     {
    	 System.out.println("The given number is zero");
     }
	}
}
