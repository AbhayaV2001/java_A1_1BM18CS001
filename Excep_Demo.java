import java.util.*;
class T1 implements Runnable
{
	Thread t;
	T1()
	{
		t=new Thread(this,"T1");
		t.start();
	}
	public void run()
	{
		while(true)
		{	
			System.out.println("BMSCE \n");
		
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("BMS thread interrupted");	
		}
		}
	}
}
class T2 implements Runnable
{
	Thread t;
	T2()
	{
		t=new Thread(this,"T2");
		t.start();
	}
	public void run()
	{
		while(true)
		{	
			System.out.println("CSE \n");
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("CSE thread interrupted");	
		}
		}
	}
}
class Excep_Demo
{
	public static void main(String args[])
	{
		T1 ob=new T1();
		T2 ob1=new T2();
	}
}
/*BMSCE 

CSE 

CSE 

CSE 

CSE 

CSE 

BMSCE 

CSE 

CSE 

CSE 

CSE 

CSE 

BMSCE 

CSE 

CSE 

CSE 

CSE 

CSE 

BMSCE 
*/


