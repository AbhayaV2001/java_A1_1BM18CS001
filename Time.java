import java.util.*;
class Timedemo
{
	int h,m,s;
	Time()
	{
		h=0;m=0;s=0;
	}
	Time(int a,int b,int c)
	{
		h=a;
		m=b;
		s=c;
	}
	void currenttime(int a,int b,int c)
	{
		h=a;
		m=b;
		s=c;
	}
	void advance(int a ,int b,int c)
	{
		s=s+c;
		m=m+b+(s/60);
		s=s%60;
		h=h+a+(m/60);
		m=m%60;
		h=h%24;
	}
	void print()
	{
		System.out.println("hour= "+h);
		System.out.println("min= "+m);
		System.out.println("seconds= "+s);
	}
}
class Time
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int ch;
		System.out.println("Enter hour,minutes,seconds");
		int hh=in.nextInt();
		int mm=in.nextInt();
		int ss=in.nextInt();
		while(true)
		{
				System.out.println("1.Default Constructor");
				System.out.println("2.Parameterized Constructor");
				System.out.println("3.Advance time");				
				System.out.println("Enter your choice");
			        ch=in.nextInt();
				switch(ch)
				{
					case 1:
						{
							Timedemo a=new Timedemo();
							a.currenttime(hh,mm,ss);
							a.print();
							break;
						}
					case 2:
						{	
							Timedemo ob=new Timedemo(hh,mm,ss);
							ob.print();
							break;							
						}
					case 3:
					    	{	System.out.println("Enter hour,minutes,seconds you want to add");
							int a=in.nextInt();
							int b=in.nextInt();
							int c=in.nextInt();							
					        	Timedemo adv=new Timedemo(hh,mm,ss);
					        	adv.advance(a,b,c);
					       	 	adv.print();
							break;
					    	}

					default:{
							System.out.println("Invalid choice:");
						}
				}
		}
	}									
}						

