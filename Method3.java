public class Method3	
{		
    public boolean isOdd(int n)	
	{	
	  if(n%2==0)	
	     return true;	
	  else 	
	     return false;	
	}	
	 public static void main(String[] args)	
	{	
	 Method3 ob1=new Method3();	
	 boolean y=ob1.isOdd(9);	
     System.out.println(y);	 
	}	
}