import java.util.Scanner;

public class facprime {

	public static void main(String[] args) {
	Scanner sc =new  Scanner(System.in);
	System.out.println("Enter a  number: ");
	int num =sc.nextInt();
	System.out.println("factorials are: ");
	for(int i=1; i<=num;i++)
	{
	if (num%i==0)
	{
		
		System.out.println(" " + i) ;
	}}
	System.out.println("prime are:");
	for (int i=2; i<=num; i++) {
		if(num%i==0)
		{
			boolean isPrime=true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
 {

}
			
		
	}
		
	}
	}
