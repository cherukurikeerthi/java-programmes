class Javapr	
{	
    private String name="Keerthi";	
    private int rollNo=43;	
    public void setName(String name){	
	   this.name=name;}	
    public void setrollNo(int rollNo){	
	   this.rollNo=rollNo;}	
	 public String getName(){	
           return name;	 
	 }	
	 public int getrollNo(){	
	       return rollNo;
}	
class Javap
{	
    public static void main(String[] args){	
	  Javapr ja=new Javapr();	
	  //ja.name = "Encapsulation";
	  //System.out.println(ja.name);	
        //ja.setName("Principle of JAVA");	
        //ja.setrollNo(43);		
        System.out.println(ja.getName());	
        System.out.println(ja.getrollNo());		
	}	  
}