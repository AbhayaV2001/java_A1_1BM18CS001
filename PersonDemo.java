import java.util.*;
class Person
{
	String name,address;
	int age;
	void getdata()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name, age,address");
		name=in.next();
		age=in.nextInt();
		address=in.next();
	}
	void putdata()
	{
		System.out.println("name	age	address");
		System.out.println(name+" \t"+age+" \t"+address);
	}
}
class Student extends Person
{
	int rollno,sem;
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rollno and the semester");
		rollno=in.nextInt();
		sem=in.nextInt();
	}
	void display()
	{
		System.out.println("rollno	sem");
		System.out.println(rollno+" \t"+sem);
	}
}
class Exam extends Student
{
	double marks1,marks2;
	double average;
	void input1()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the marks1,marks 2");
		marks1=in.nextDouble();
		marks2=in.nextDouble();
	}
	void calculate()
	{
		average=(marks1+marks2)/2;
	}
	void display1()
	{
		System.out.println("Marks1:"+marks1+"\n"+"Marks2:"+marks2+"\n"+"Average:"+average);
	}
}
class PersonDemo
{	
	public static void main(String args[])
	{	
		int i,n,count=0;
		double highest;
		String topper;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=in.nextInt();
		Exam ob[]=new Exam[n];
		for(i=0;i<n;i++)
		{	
			ob[i]=new Exam();
			ob[i].getdata();
			ob[i].putdata();
			ob[i].input();
			ob[i].display();
			ob[i].input1();
			ob[i].calculate();
			ob[i].display1();
		}
		highest=ob[0].average;
		for(i=0;i<n;i++)
		{
			if(ob[i].average>highest)
			{
				highest=ob[i].average;
			}
		}
		for(i=0;i<n;i++)
		{
			if(ob[i].average==highest)
			{
				count=i;
				break;
			}
		}
		topper=ob[count].name;
		System.out.println("The topper of the class is: "+topper);
	}
}
		
	 
		
		
	
