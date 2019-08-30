import java.util.*;
class Matrixdemo
{
	float m[][]=new float[2][2];
        int i,j,r,c;
	Matrixdemo()
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				m[i][j]=0;
			}
		}
	}
	Matrixdemo(int p,int q)
	{
		r=p;
		c=q;
		Scanner se=new Scanner(System.in);
		System.out.println("Enter elements in Matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m[i][j]=se.nextFloat();
			}
		}
	}
	Matrixdemo(Matrixdemo ob)
	{
		r=ob.r;
		c=ob.c;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m[i][j]=ob.m[i][j];
			}
		}
	}
	float determinant()
	{
		return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
	}
	void inverse()
	{
		float temp;
		float det=determinant();
		if(det!=0.0)
		{
				
			temp=m[0][0];
			m[0][0]=m[1][1];
			m[1][1]=temp;
			m[0][1]=0-m[0][1];
			m[1][0]=0-m[1][0];
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					m[i][j]=m[i][j]/det;
				}
			}
			
		}
		else
			System.out.println("Inverse can not b determined");
	}
	boolean singular()
	{
		if(determinant()!=0.0)
		{	
			return true;
		}
		else 
		{
			return false;
		}
	}
	void print_data()
	{
		if(determinant()!=0.0)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(m[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
}
class Matrix
{
	public static void main(String args[])
	{
		Matrixdemo m1= new Matrixdemo(2,2);
		Matrixdemo m2 = new Matrixdemo(m1);
		float e1 =m1.determinant();
		System.out.println("Nature of  matrix is :   ");
		if(m2.singular())
		System.out.println("Singular");
		else 
		System.out.println("Not Singular");
		System.out.println("Determinant of matrix is :   " + e1);
		System.out.println("Inverse of matrix is :   ");
		m2.inverse();
		m2.print_data();
	}
}
/*
Enter elements in Matrix
4
5
6
8
Nature of  matrix is :   
Singular
Determinant of matrix is :   2.0
Inverse of matrix is :   
4.0 -2.5 
-3.0 2.0 
*/
