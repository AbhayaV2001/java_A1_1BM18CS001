import java.util.*;
class Quadratic
{
	public static void main(String args[])
	{
		System.out.println("enter a,b,c of quadratic equation");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		double d=(b*b)-(4*a*c);
		double r1=0,r2=0;
		if(d==0)
		{
			System.out.println("roots are real and equal");
		        r1=(-b/(2*a));
			r2=r1;
		}
		else if(d>0)
		{
			System.out.println("roots are real and distinct");
			r1=(-b+(Math.sqrt(d)))/(2*a);
			r2=(-b-(Math.sqrt(d)))/(2*a);
		}
		else 
		{
			System.out.println("Roots are imaginary");
			r1=(-b+(Math.sqrt(-d)))/(2*a);
			r2=(-b-(Math.sqrt(-d)))/(2*a);
		}
		System.out.println("roots are "+r1+" and "+r2);
	}
}
