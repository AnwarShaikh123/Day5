import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		double result=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		for(int i=num;i>0;i--)
		{
			result= result+ (double)1/i;
			System.out.println("result are:" +result);
		}

	}

}
