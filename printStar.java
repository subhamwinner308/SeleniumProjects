import java.util.Scanner;

public class printStar {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number rows of the star pattern you want to print");
		
		int row = sc.nextInt();
		
		sc.close();
		
		for(a=1;a<=row;a++) {
			int k = a;
			while(k!=0) {
				System.out.print("* ");
				k--;
			}
			System.out.println();
			k=0;
		}

	}

}
