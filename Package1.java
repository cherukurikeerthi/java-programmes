//Student.java	
package Package1;	
class Student{	
    String name;	
	int rollNo;	
	void display()	
	{		
	     System.out.println("name :"+name);	
		 System.out.println("name :"+rollNo);			 
    }	
    public static void main(String[] args){ 	
          Student st1 = new Student();	
          st1.name = "Keerthi";	
          st1.rollNo = 43;	 
          st1.display();	
    }		  
} 