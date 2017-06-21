import java.util.*;
import java.lang.*;
import java.io.*;
public class leap {
    public static void main(String[] args) 
   {
      System.out.println("Enter the Year:");
      Scanner s= new Scanner(System.in);
      int num = s.nextInt();
      if( num % 4 == 0 )
      {
        System.out.println("The given year is leap ");
      }
      else
      {
        System.out.println("The given year is not a leap one");
       }
  }
}
