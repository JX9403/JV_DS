import java.util.Scanner;

public class B3Domino {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(1l * n / 2 * m);
		} else {
			System.out.println(1l * ( n - 1 )/ 2 * m + m / 2);
		}
	
	}

}
