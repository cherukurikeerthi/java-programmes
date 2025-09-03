public class Operators	
{		
    public static void main(String[] args)	
	{	
	    //Arthimetic operators
     int num1=5;	
	 int num2=8;	
	 System.out.println(num1+num2);	
	 System.out.println(num1-num2);	
     System.out.println(num1*num2);	
	 System.out.println(num1/num2);	
	 System.out.println(num1%num2);		
	 //unary operators 
     int x=10;	
     System.out.println(++x);	 
     System.out.println(x++);
     System.out.println(x--);	
	 System.out.println(--x);	
	 System.out.println(++x + --x);	
	 //assignment operators	
	 int y=20;	
	 System.out.println(y+=20);	
	 //relational operators
	 int p=30;	
	 int q=40;	
	 System.out.println(p==q);
     System.out.println(p!=q);	
	 //logical operators
	 int b=5;	
	 int c=9;	
	 System.out.println(b>c && c>b);	
     //bitwise and,or,not,xor	
     int g=5;	
     int f=8;	
     System.out.println(g&f);
     System.out.println(g|f);	
     System.out.println(g^f);	
     System.out.println(~g);	
     //shift operators 	
     System.out.println(f<<1);
     System.out.println(f>>1);	 
	 //ternary operators		 
	 System.out.println((8>2)? "Yes":"No");
	}	
}	
	 
	
