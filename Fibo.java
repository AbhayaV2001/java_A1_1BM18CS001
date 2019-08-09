import java.util.*;
class Fibo
{
	public static void main(String args[])
	{
		int n;		
		System.out.println("Emter the no of terms to print in the series");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		fibo(n);
	}
	public static void fibo(int num)
	{
		int a=0,b=1,i,c=0;
		if(num==2)
		{
			System.out.println("The series is 0,1");
		}
		else if(num>2)
		{
			System.out.print("the series is 0,1,");
			for(i=3;i<=num;i++)
			{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}	}
	}
}

		
		
		
		
