import java.util.Scanner;

public class B17TichCacUoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long tich = 1;

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				tich *= i;
				if (n / i != i) {
					tich *= n / i;
				}
			}
		}
		System.out.println(tich);
	}
}
