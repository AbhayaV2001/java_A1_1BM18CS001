import java.util.*;
public class Father
{
  int f_age;
  Father(int f_age)
  {
    this.f_age=f_age;
  }
}
public class Son extends Father
{ Son()
  {
    System.out.println("Enter father age");
    f_age=in.nextInt();
    super(f_age);
  }
  System.out.println("Enter son age");
  int s_age=in.nextInt();
  try {
          if(s_age==f_age || s_age>f_age)  
          {
            throw new WrongAge();
          }
  } catch(WrongAge e) {
    System.out.println("Invalid ages "+e);
  } 
}
public class WrongAge extends Exception
{
  String details;
  WrongAge()
  {
    details="Son age and father age not comaptible!";
  }
  String toString()
  {
    return details;
  }
}
public class Ex_Demo {
    public static void main(String[] args) {
        Son ob=new Son();
     }
}
