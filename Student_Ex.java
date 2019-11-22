import java.util.*;

class Noargs extends Exception
{
	public String toString()
	{
		return "Command line args empty";
	}
}
class Neg extends Exception
{
	String s; 
	public String toString()
	{
		s =  "Negative marks";
		return s;
	}
}
class Student_Ex{

	public static void main(String args[]){
		try{ 
			if(args.length == 0)throw new Noargs(); 
				String usn=args[0];
		String name=args[1];
		int marks[]=new int[3];
		marks[0]=Integer.parseInt(args[2]);
		marks[1]=Integer.parseInt(args[3]);
		marks[2]=Integer.parseInt(args[4]);
            		for (int i = 2;i<args.length;i++) {
				if(Integer.parseInt(args[i])<0)throw new Neg();
			} 
			for(String x:args)
				System.out.println(x);
		}
		catch(Noargs e)
		{
			System.out.println(e);
		}
		catch(Neg e)
		{
			System.out.println(e);
		}
	}

}
