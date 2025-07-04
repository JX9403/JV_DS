import java.util.Scanner;

public class LatDaQuangTruong {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n, m, a ;
	
	n = sc.nextInt();
	m = sc.nextInt();
	a = sc.nextInt();
	
	int x, y;
	if( n % a == 0) {
		x = n / a;
	} else x = n / a + 1;
	
	if ( m % a == 0) {
		y = m / a ; 
	} else y = m / a + 1 ;
	
	System.out.print(1l * x * y );
}
}
