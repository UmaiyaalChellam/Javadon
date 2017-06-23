package camels;

public class camelcase {
    public static void main(String[] args)
    {
    	String start="mEPCO sChLeNk Sivakasi";
    	StringBuffer sb=new StringBuffer();
    	for(String s:start.split(" "))
    	{
    		sb.append(Character.toUpperCase(s.charAt(0)));
    		if(s.length()>1)
    		{
    			sb.append(s.substring(1,s.length()).toLowerCase());
    		}
    			
    	}
    	System.out.println("The Camel case is:" +sb);
    }
}
