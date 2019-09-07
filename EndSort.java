import java.util.*;
class EndSort
{   
    int arr[10];
    int minMoves(int arr[], int n) 
    { 
        int expectedItem = n; 
        for (int i=n-1; i >= 0; i--) 
        { 
            if (arr[i] == expectedItem) 
                expectedItem--; 
        } 
        return expectedItem; 
    }
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number numbers with a space b/w two numbers");
        do
        {
            arr[i]=in.nextInt();
            i++;
        }while(arr[i]!='/0');
    void main() 
    { 
        int arr[] = {4, 3, 2, 1}; 
        int n = arr.length/Integer.toString(arr[0]).length(); 
        System.out.println(minMoves(arr, n));  
    }
}
}
