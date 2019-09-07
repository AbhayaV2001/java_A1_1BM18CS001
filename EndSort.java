import java.util.*;
class EndSort
{   
    public static void main(String args[]) 
    {  
        Scanner in=new Scanner(System.in);
        EndSort ob=new Endsort();
        System.out.println("Enter the numbers of terms");
        int num=in.nextInt();
        int arr[]=new int[num];
        int n1=ob.input(arr,num);
        
        System.out.println(ob.minMoves(arr, n1));  
    }
    int minMoves(int arr[], int n) 
    { 
        int expectedItem = n; 
        for (int i=n-1; i>=0; i--) 
        { 
            if (arr[i] == expectedItem) 
                expectedItem--; 
        } 
        return expectedItem; 
    }
    int input(int arr[],int no)
    {
        Scanner in=new Scanner(System.in);
        int i=0;
        System.out.println("Enter the numbers with a space b/w two numbers");
        for(i=0;i<no;i++)
            arr[i]=in.nextInt();
        int n = arr.length/Integer.toString(arr[0]).length();
        return n;
    }
}
