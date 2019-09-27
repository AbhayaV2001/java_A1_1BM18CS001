import java.util.*;
import Databank.*;
public class Employee
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		Databank ob= new Databank();
		ob.getdata();
		while(true)
		{
			System.out.println("Enter \n1.Add money\n2.Withdraw\n3.Display Balance\n4.Exit");
			System.out.println("Enter your Choice:");						
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:ob.addmoney();
					break;
				case 2:ob.withdraw();
					break;
				case 3:ob.displaybal();
					break;
				case 4:System.exit(1);
					break;
				default: System.out.println("Invalid Choice.");
					break;
			}
		}	
	}
}
/*Enter User name:
Abhaya
Enter Account number:
107976
Enter Total balance:
50000
Enter 
1.Add money
2.Withdraw
3.Display Balance
4.Exit
Enter your Choice:
1
Enter the amount to be added:
20000
The Current balance is:70000.0
Enter 
1.Add money
2.Withdraw
3.Display Balance
4.Exit
Enter your Choice:
2
Enter the amount to be Withdrawn:
20000
The current balanc is:50000.0
Enter 
1.Add money
2.Withdraw
3.Display Balance
4.Exit
Enter your Choice:
3
The current balance is:50000.0
Enter 
1.Add money
2.Withdraw
3.Display Balance
4.Exit
Enter your Choice:
4
*/
