public class Method1	
{	
     public int returnValueFunction(int n)	
	 {	
	   return (2*n);	
	 }	
       public static void main(String[] args)	 
	 {	
     Method1 ob1=new Method1();	 
	 int ans=ob1.returnValueFunction(2);		
     System.out.printf("ans=%d",ans);	 
	 }
}