import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		int count=1;
		double randum=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of flips:");
		int flips=sc.nextInt();
		{
			if(flips<0) {
				System.out.println("Enter a valid input");
				return;
				
			}
		while(count<=flips&& flips>0)
		
			 randum= Math.random();
			 System.out.println(count + " " + randum);
			if(randum<0.5)
			{
				heads++;
				System.out.println("It's  a head");
			}
			else {
				tails++;
				System.out.println(" It's is tail" );
			}
			count++;
			
		}
		
		System.out.println("Number of heads are: " + heads);
		System.out.println(" Number of tails are : " + tails );
		double headpercent= (double)heads/flips*100;
		
		System.out.println("number of headpercent is " + headpercent);
		
		double tailspercent= (double)tails/flips*100;
		System.out.println("number of tailspercent is " + tailspercent);
	}

}
