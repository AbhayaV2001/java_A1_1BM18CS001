import java.util.*;
class Largest
{
	public static void main(String args[])
	{	
		int i,large;
		large=Integer.parseInt(args[0]);
		for(i=1;i< args.length;i++)
	    	{
			if(Integer.parseInt(args[i-1])<Integer.parseInt(args[i]))
			large=Integer.parseInt(args[i]);
		}
		System.out.println("The largest number is "+large);
	}
}
