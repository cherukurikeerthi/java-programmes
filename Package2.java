public class Method
{	
    public void min(int x, int y) 
    {	
	    if (y<x)	
		    System.out.println(y);	
		else
		    System.out.println(x);	
	}	
	  public static void main(String[] args)	
	{	
      Method ob1=new Method();	
	  ob1.min(10,20);	
	}	
}