import java.util.Scanner;

public class Vowel_conso {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character:");
	
		char c=Character.toLowerCase(sc.next().charAt(0));
		if(c=='a'|| c == 'e' || c=='i' || c=='o'|| c =='u')
		{
			System.out.println("it is a vowel");
		}
		else
		{
			System.out.println("It is a consonant");
		}

	}

}
