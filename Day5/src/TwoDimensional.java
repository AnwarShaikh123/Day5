import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row=sc.nextInt();
		System.out.println("Enter number of column:");
		int column=sc.nextInt();
		int size=row*column;
		int a[][]=new int[row] [column];
		for(int i=0; i<row;i++){
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter the element for " +i+"row" +j+"column");
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}

	}

}
