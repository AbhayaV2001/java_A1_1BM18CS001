import java.util.*;
class Account
{
	String name;
	long c_no;
	double balance;
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name, customer number and balance");
		name=in.next();
		c_no=in.nextLong();
		balance=in.nextDouble();
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("customer number:"+c_no);
		System.out.println("balance:"+balance);
	}
}
class Savings extends Account
{
	double rate;
	int time;
	void input1()
	{
		input();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rate and time");
		rate=in.nextDouble();
		time=in.nextInt();
	}
	double compute()
	{
		return(balance*rate*time);
	}
	void output()
	{
		display();
		System.out.println("rate  time    interest");
		System.out.println(rate+"\t"+time+"\t"+compute());
	}
}
class AccountDemo
{
	public static void main(String args[])
	{
		Savings s=new Savings();
		s.input1();
		s.output();
	}
}

