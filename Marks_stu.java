import java.util.*;
class Marks
{
    double m[][];
    int num_stu,num_sub;
    void input()
    {
        System.out.println("Enter number of students and number of subjects");
        Scanner in=new Scanner(System.in);
        num_stu=in.nextInt();
        num_sub=in.nextInt();
        m=new double[num_stu+2][num_sub+2];
        System.out.println("Enter marks in matrix");
        for(int i=0;i<num_stu;i++)
        {
            for(int j=0;j<num_sub;j++)
            {
                m[i][j]=in.nextDouble();
            }
        }
    }
    void calc()
    {
        double sum=0.0;
        double avg=0.0;
        for(int i=0;i<num_stu;i++)
        {
            for(int j=0;j<num_sub;j++)
            {
                sum=sum+m[i][j];
            }
            m[i][num_sub]=sum;
            avg=(double)sum/num_sub;
            m[i][num_sub+1]=avg;
            sum=0.0;
        }
        for(int j=0;j<num_sub;j++)
        {
            for(int i=0;i<num_stu;i++)
            {
                sum=sum+m[i][j];
            }
            m[num_stu][j]=sum;
            avg=(double)sum/num_stu;
            m[num_stu+1][j]=avg;
            sum=0.0;
        }
    }
    void print()
    {
        System.out.println("Details are");
        for(int i=0;i<num_stu+2;i++)
        {
            for(int j=0;j<num_sub+2;j++)
            {
                  System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Marks_stu
{
    public static void main(String args[])
    {
        Marks ob=new Marks();
        ob.input();
        ob.calc();
        ob.print();
    }
}
