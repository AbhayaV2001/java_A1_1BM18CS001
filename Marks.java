import java.util.*;
class Student
{
	String USN,name;
	int arrc[],sub;
	int arrm[];
	void get_data()
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of student");
		name=sc.next();
		System.out.println("Enter usn no");
		USN=sc.next();
		System.out.println("Enter no of subjects");
		sub=sc.nextInt();
		arrc=new int[sub];
		arrm=new int[sub];
		for(i=0;i<sub;i++)
		{
			System.out.println("Enter credits in sub  " + (i+1)+":");
			arrc[i]=sc.nextInt();
		}
		for(i=0;i<sub;i++)
		{
			System.out.println("\n\nEnter marks in sub  " + (i+1)+":");
			arrm[i]=sc.nextInt();
		}
	}

	void cal_sgpa()
	{
		int sum=0,total=0,i,points;
		for(i=0;i<sub;i++)
		{
			if(arrm[i]>=90&&arrm[i]<=1000)
				points =10;
			else if(arrm[i]>=75&&arrm[i]<=89)
				points =9;
			else if(arrm[i]>=65&&arrm[i]<=74)
				points =8;
			else if(arrm[i]>=55&&arrm[i]<=64)
				points =7;
			else if(arrm[i]>=40&&arrm[i]<=54)
				points  =6;
			else
				points = 4;
			sum=sum +(points*arrc[i]);
		}
		for(i=0;i<sub;i++)
		{
			total=total+arrc[i];
		}
		float sgpa=(float)sum/total;
		System.out.println("SGPA of stusubdent is :  " + sgpa);
		
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("USN= "+USN);
	}
	
}
class Marks
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		s.get_data();
		s.cal_sgpa();
		s.display();
	}
}
	
