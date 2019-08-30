import java.util.*;
class Bookdemo
{
	double price;
	int num_pages;
	String name, author,e;
	Bookdemo()
	{
		name="\0";
		author="\0";
		price=0.0;
		num_pages=0;
	}
	void input(String a,String b,double c,int d)
	{
			
		name=a;
		author=b;
		price=c;
		num_pages=d;
	}
	String ToString()
	{
		String s="name: "+name+"\nauthor: "+author+"\nprice: "+price+"\nnumber of pages: "+num_pages;	
		return s;
	}
	void getdata()
	{
		e=ToString();
		System.out.println("THE DETAILS OF THE BOOK ARE \n"+e);		
	}
}
class Book
{
	public static void main(String args[])
	{
		int n,i;
		String a,b;
		double c;int d;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of books");
		n=in.nextInt();
		Bookdemo ob[]=new Bookdemo[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new Bookdemo();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Enter name,author,price,number of pages in book "+(i+1));
			a=in.next();
			b=in.next();
			c=in.nextDouble();
			d=in.nextInt();
			ob[i].input(a,b,c,d);
			ob[i].getdata();
		}
	}
}
/* Enter the number of books
1
Enter name,author,price,number of pages in book 1
TheLostSymbol
DanBrown
699
786
THE DETAILS OF THE BOOK ARE 
name: TheLostSymbol
author: DanBrown
price: 699.0
number of pages: 786 */

			

		
		
