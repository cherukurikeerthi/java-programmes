public class Stringk	
{	
   public static void main(String[] args)	
   {	
   String sr1 = "Hello";//creating with string literal 	
   String sr2 = "Hello";	
   String sr3=new String("Hello");//with new keyword	
   String sr4="hello ";	
    {	
     System.out.println(sr1==sr2);	
	 System.out.println(sr1!=sr3);	
	 System.out.println(sr1!=sr4);	0
	 System.out.println(sr1[0]);
    }	
   }	
}