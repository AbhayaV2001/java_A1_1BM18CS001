import java.util.*;
class Time
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
		h=h%24;
	}
	void print()
	{
		System.out.println("hour= "+h);
		System.out.println("min= "+h);
		System.out.println("seconds= "+h);
	}
}
class Timedemo
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
							Time a=new Time();
							a.currenttime(hh,mm,ss);
							a.print();
							break;
						}
					case 2:
						{	
							Time ob=new Time(hh,mm,ss);
							ob.print();
							break;							
						}
					case 3:
					    	{
					        	Time adv=new Time(hh,mm,ss);
					        	adv.advance(3,56,77);
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

