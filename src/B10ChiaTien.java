import java.util.Scanner;

public class B10ChiaTien {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, a, b, c ;
		
		n = sc.nextInt();
		a= sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(( a + b + c + n) % 3 == 0  ) {
			int q = (a + b + c + n) / 3 ;
			if ( q >= a && q >= b && q >= c) {
				System.out.print("YES");
			} else System.out.print("NO");
		} 
		else 
			System.out.print("NO");
	}
}
