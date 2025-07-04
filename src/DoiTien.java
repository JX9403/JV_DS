import java.util.Scanner;

public class DoiTien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int res = n / 100;
		n %= 100;

		res += n / 20;
		n %= 20;

		res += n / 10;
		n %= 10;

		res += n / 5;
		res %= 5;
		
		res += n;
		
		System.out.print(res);
	}
}
