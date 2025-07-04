import java.util.Scanner;

public class Doremon {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n, m, res, minstep ;
	n = sc.nextInt();
	m = sc.nextInt();
	
	if ( n % 2 == 0 ) {
		minstep = n / 2 ;
	} else minstep = n / 2 + 1 ;
	
	res = ( minstep + m - 1 ) / m * m ;
	
	if ( res <= n ) System.out.print(res); else System.out.print(-1);
}
}
