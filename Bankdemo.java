import java.util.*;
class Bank
{
	String name,type;
	int acc_no;
	double amount;
	Scanner in=new Scanner(System.in);
	void type(int choice)
	{
		if(choice==1)
			type="Savings";	
		if(choice==2)
			type="Current";
	}
	void input()
	{
		System.out.println("Enter the name,acc number and balance");
		name=in.next();
		acc_no=in.nextInt();
		amount=in.nextDouble();
	}
	void deposit()
	{
		System.out.println("Enter the amount to be deposited");
		double x=in.nextDouble();
		amount=amount+x;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Account number:"+acc_no);
		System.out.println("Type:"+type);
		System.out.println("balance:"+amount);
	}
}
class Savings_acc extends Bank
{
	double a,cinterest;
	int r,t;
	Scanner in=new Scanner(System.in);
	void withdrawal()
	{
		System.out.println("Enter amount to be withdrawn:");
		double amtw=in.nextDouble();
		if(amtw<=amount)
			amount=amount-amtw;
		else
			System.out.println("Invalid amount");
	}
	void cmp_interest()
	{	
		System.out.println("Enter the rate and time");
		r=in.nextInt();
		t=in.nextInt();
		a=amount* Math.pow(1 + (r *0.01),t);
        	cinterest= a - amount;

	}
	void display()
	{
		super.display();
		System.out.println("Compound Interest after " + t + " years: "+cinterest);
        	System.out.println("Amount after " + t + " years: "+a);
	}	
}
class Current_acc extends Bank
{
	double min=10000;
	void input()
	{
		super.input();
	}
	void service_charge()
	{	
		if(amount<min)
		amount=amount-500;
	}
	void display()
	{
		super.display();
	}
}
class Bankdemo
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("1.Savings account");
		System.out.println("2.Current account");
		int choice=in.nextInt();
		
		if(choice==1)
		{
			Savings_acc b=new Savings_acc();
			b.type(choice);
			b.input();
			b.deposit();
			b.withdrawal();
			b.cmp_interest();
			b.display();
		}
		else if(choice==2)
		{
			Current_acc b=new Current_acc();
			b.type(choice);
			b.input();
			b.deposit();
			b.service_charge();
			b.display();
		}
		else 
			System.out.println("Invalid choice");
	}
}
				
		
