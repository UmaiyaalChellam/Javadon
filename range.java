package Primeno;

import java.util.Scanner;

public class range {
            public static void main(String args[])
            {
            	int i,j,flag=0;
            	Scanner s=new Scanner(System.in);
            	System.out.println("Enter the lower limit:");
            	int s1=s.nextInt();
            	System.out.println("Enter the upper limit:");
            	int s2=s.nextInt();
            	System.out.println("The prime numbers between the entered limits are:");
            	for(i=s1;i<=s2;i++)
            	{
            		for(j=2;j<i;j++)
            		{
            			if(i%j==0)
            			{
            				flag=0;
            				break;
            			}
            			else
            			{
            				flag=1;
            			}	
            		}
            	    if(flag==1)
            	    {
            	    	System.out.println(i);
            	    }
            	}
            }
}   
            		
  
