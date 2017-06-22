package integers;
import java.util.Scanner;
public class intnum {
       public static void main(String[] args)
       {
    	   int n,reverse=0;
    	   System.out.println("Enter the number:");
    	   Scanner s=new Scanner(System.in);
    	    n=s.nextInt();
    	   
    	   while(n!=0)
    	   {
    		   reverse=reverse*10;
    		   reverse=reverse+n%10;
    		   n=n/10;
    	   }
    	   System.out.println("The Reverse String is:" +reverse);
       }
}
