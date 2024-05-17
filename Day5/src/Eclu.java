

public class Eclu {

	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
	
	Double Distance=Math.sqrt(x*x+y*y);
	System.out.println("The euclidesn distance from (" + x + "," + y + ") to (0,0) is" + Distance);
	

	}

}
