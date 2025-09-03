import java.util.Scanner;
public class Nested
{	
     public static void main(String[] args)	
	 {	
	 Scanner s=new Scanner(System.in);	
	 System.out.print("enter n value");
	 int n=s.nextInt();		
	 for (int row=1;row<=n;row++);	
	 {	
	    for (int col=1;col<=n;col++);	
	 {	
	    if(row==1||row==n||col==1||col==n)	
		{	
		Systemout.print("#"+"  ");	
		}	
        else	
		 {	
            System.out.print("  ");	
         }			
	 }	
	 System.out.println();	
	 }	
	 }	
}