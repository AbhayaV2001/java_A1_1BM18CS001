
import java.util.*;
class WrongAge extends Exception
{
  String s;
  WrongAge(String n)
  {
     s=n;
  }
  public String toString()
  {
     return s;
  }
}
class Father
{
  int age1;
  Father() throws WrongAge
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter father's age:");
     age1=sc.nextInt();
     if(age1<=0)
        throw new Wrongage("invalid age");
  }
}
class Son extends Father
{
   int age2;
   Son() throws WrongAge
   {  
      super();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter son's age:");
      age2=sc.nextInt(); 
      if(age2<0)
         throw new WrongAge("invalid age");
      if(age1==age2)
         throw new WrongAge("Invalid data")
      if(age1-age2<21)
         throw new WrongAge("Illegal age difference");
   }
}
class Ex_demo
{
    public static void main(String args[])
    {
        try
        {
             Son s=new Son();
        }
        catch(WrongAge e)
        {
           System.out.println(e);
        }
     }
}
