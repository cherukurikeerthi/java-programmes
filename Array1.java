import java.util.Scanner;
public class Array1	
{	
   public static void reverse(int[] arr,int[] size)	
   {	
    for (int i=arr.length-1;i>=0;i--)	
	{	
      System.out.println(arr[i]+" ");	
	}
   }	
    public static void main(String[] args)  
   {	
       Scanner sc = new Scanner(System.in);	
       System.out.println("enter the size of the array");	   
	   int size=sc.nextInt();	
       int[] arr=new int[size];	   
       for(int i=0;i<size;i++)		
	   System.out.println("enter the array elements");	
       {	
           arr[i]=sc.nextInt();	
       }		   
   }	
}