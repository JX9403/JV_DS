import java.util.Scanner;

public class MuaNuoc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, a, b, res;
		a = sc.nextInt();
		b = sc.nextInt();
		n = sc.nextInt();
		
		
		if( a > b / 2 ) {
			res = n * a ;
		} else {
			if ( n % 2 == 0 ) {
				res = n/2 * b ;
			} else {
				res = n/2 * b + a ;
			}
		}
		 
		System.out.print(res);
		
	}
}
