import java.util.Arrays;	
public class ArrayToString {	
  public static void main(String[] args){	
  
  int[]n={9,2,1,4};		
  int[]x={9,2,1,4};	
  Arrays.fill(n,10);
  {	  
  System.out.println(Arrays.toString(n));	
  System.out.println(Arrays.equals(n,x));  
  }	
 }  
}