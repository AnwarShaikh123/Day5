import java.util.Scanner;

public class Quadractic {

	public static void main(String[] args) {
	double a,b,c, d,r1,r2;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the value of a: ");
	a= sc.nextDouble();
	System.out.println("Enter the value of b:");
	b=sc.nextDouble();
	System.out.println("Enter a value of c: ");
	c=sc.nextDouble();
	
	d=b*b-4*a*c;
	
	if(d>0) {
		System.out.println(" roots are real and distinct ");
		
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("root 1: " +r1);
		System.out.println("root 2: " +r2);
		
	}
	else if(d==0){
		r1=-b/(2*a);
		System.out.println("Root 1: " + r1);
	}
	
	else 
		System.out.println("the root are imaginary");
	
	

	}

}
