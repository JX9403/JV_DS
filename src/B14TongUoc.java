import java.util.Scanner;

public class B14TongUoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();
		
		long sum = 0;

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum += i;
				if (n / i != i)
					sum += n / i;
			}
		}
		System.out.print(sum);
	}
}
