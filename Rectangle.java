import java.util.*;
class Rect
{
	int length,breadth;
	double area;
	void input()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		length=in.nextInt();
		breadth=in.nextInt();
	}
	void calculate()
	{
		area=length*breadth;
	}
	void output()
	{
		System.out.println("length \tbreadth area ");
		System.out.println(length +"\t "+breadth+"\t "+area);
	}
}
class Rectangle
{
	public static void main(String args[])
	{
		Rect r1=new Rect();
		Rect r2=new Rect();
		System.out.println("Enter the dimesions of first rectangle");
		r1.input();
		System.out.println("Enter the dimesions of second rectangle");
		r2.input();
		r1.calculate();
		r2.calculate();
		System.out.println("Dimensions and area of first rectangle:");
		r1.output();
		System.out.println("Dimensions and area of second rectangle");
		r2.output();
	}
}
		
		
		
		
