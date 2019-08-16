import java.util.*;
public class Matrix_add_sub
{
	public static void main(String[] args) 
	{
       		Scanner in = new Scanner(System.in);
       		System.out.print("Enter number of rows: ");
       		int rows = in.nextInt();
       		System.out.print("Enter number of columns: ");
       		int columns = in.nextInt();
       		int a[][] = new int[rows][columns];
       		int b[][] = new int[rows][columns];
       		System.out.println("Enter the first matrix");
       		for (int i = 0; i < rows; i++) 
		{
           		for (int j = 0; j < columns; j++) 
			{
               			a[i][j] = in.nextInt();
           		}
       		}
       		System.out.println("Enter the second matrix");
       		for (int i = 0; i < rows; i++) 
		{
	        	for (int j = 0; j < columns; j++) 
			{
               		b[i][j] = in.nextInt();
           		}
       		}
       		int c[][]= new int[rows][columns];
		int d[][]= new int[rows][columns];
       		for (int i = 0; i < rows; i++) 
		{
	        	for (int j = 0; j < columns; j++) 
			{
               			c[i][j] = a[i][j] + b[i][j];
				d[i][j] = a[i][j] - b[i][j];
           		}
       		}
       		System.out.println("The sum of the two matrices is");
       		for (int i = 0; i < rows; i++) 
		{
           		for (int j = 0; j < columns; j++) 
			{
               			System.out.print(c[i][j] + " ");
           		}
           		System.out.println();
      	 	}
		System.out.println("The difference of the two matrices is");
       		for (int i = 0; i < rows; i++) 
		{
           		for (int j = 0; j < columns; j++) 
			{
               			System.out.print(d[i][j] + " ");
           		}
           		System.out.println();
      	 	}
   	}
}
