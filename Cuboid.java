//Cuboid.java	
class Cuboid{		
    int length;	
	int width;	
	int height;	
    int area(){	
        return 2*length*width+2*height*width+2*length*height;	
    }			
	public static void main (String[] args){	
	    Cuboid cu1 = new Cuboid();	
		Cuboid cu2 = new Cuboid();
		cu1.length = 10;	
		cu1.width = 20;	
		cu1.height = 30;	
        cu2.length = 100;	
		cu2.width = 200;	
		cu2.height = 300;				
		System.out.println(cu1.area());	
        System.out.println(cu2.area());		
	}	
}	