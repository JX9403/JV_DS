import java.util.Scanner;

public class B19VeHinh2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j>=i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();
		

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(  i == n|| j == i || j == 1) {
					System.out.print("*");
				} else {
					
						System.out.print(" ");
					
				}
			}
			System.out.println();
		}

		System.out.println();
	}
}
