import java.util.*;
public class Max2d 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
       		System.out.print("Enter number of rows: ");
       		int rows = in.nextInt();
       		System.out.print("Enter number of columns: ");
       		int columns = in.nextInt();
       		int a[][] = new int[rows][columns];
       		System.out.println("Enter the matrix");
       		for (int i = 0; i < rows; i++) 
		{
           		for (int j = 0; j < columns; j++) 
			{
               			a[i][j] = in.nextInt();
           		}
       		}
		int max= a[0][0];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				if(max<a[i][j])
				{
		                	max= a[i][j];
                		}
            		}
        	}
		System.out.println("Maximum number in the array is "+ max);
            	System.out.println();              

    	}

}
