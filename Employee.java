import java.util.*;
public class Empdemo
{
    String empno,empname;
    double basic,da,it,net,gross;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee Name:");
        empname=sc.next();
        System.out.println("Enter the employee Number:");
        empno=sc.next();
        System.out.println("Enter the employee Basic Salary:");
        basic=sc.nextDouble();
    }
    void calculate()
    {
        da=(75*basic)/100;
        gross=basic+da;
        it=(30*gross)/100;
        net=basic+da-it;
    }
    void display()
    {
        System.out.println("Enter the employee Name:"+empname);
        System.out.println("Enter the employee Number:"+empno);
        System.out.println("Enter the employee Basic Salary:"+basic);
        System.out.println("Enter the employee DA:"+da);
        System.out.println("Enter the employee IT:"+it);
        System.out.println("Enter the employee Net Salary:"+net);
    }
}
public class Employee
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        employee ob=new employee();
        System.out.println("Enter the number of employees");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {   
            ob.read();
            ob.calculate();
            ob.display();
        }
    }
}