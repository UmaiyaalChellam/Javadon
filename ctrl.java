import java.util.*;
import java.lang.*;
import java.io.*;
public class ctrl {
    public static void main(String[] args) 
   {
      System.out.println("Enter the Number:");
      Scanner s= new Scanner(System.in);
      int num = s.nextInt();
     if(num % 2 ==0)
     {
        System.out.println("The Given number is even");
     }
     else 
     {
        System.out.println("The given number is odd");
     }
  }
}
