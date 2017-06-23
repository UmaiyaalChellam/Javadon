package swap;

public class evenodd {
         public static void main(String args[])
         {
        	 String s="ABCDEFGH";
        	 StringBuilder sb=new StringBuilder();
        	 char[] c=s.toCharArray();
        	 for(int i=0;i<c.length;i++)
        	 {
        		if(i%2==0)
        		{

					if((i+1)<c.length)
        			{
        				sb.append(c[i+1]);
        			}
        			sb.append(c[i]);
        		}
        	 }
        	 
        	 System.out.println(sb);
         }
}
