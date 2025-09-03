import java.util.Scanner;
public class Arrayp	
{	
   public static void reverse(int[] arr)	
   {	
    for(int i=arr.length-1;i>=0;i--)	
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
        System.out.println("enter the array elements");	   
       for(int i=0;i<size;i++)			
       {	
           arr[i]=sc.nextInt();		
       }	
       reverse(arr);	   
   }	
}