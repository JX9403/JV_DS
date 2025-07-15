 package LyThuyetSo;

import java.util.Scanner;

public class B54BoiChungNhoNhat3So {
	public static int gcd ( int a, int b) {
		if( b == 0) return a ;
		return gcd( b, a % b) ;
	}
	
	public static int lcm ( int a, int b) {
		return a / gcd( a , b ) * b ;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		
		
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt() ;
		int n = sc.nextInt() ;
		
		int tmp = lcm(x, lcm(y, z)) ;
		
		double m = Math.pow( 10, n - 1 ) ;
		
		int res = (int)( m + tmp - 1) / tmp * tmp ;
		
		if( res < Math.pow( 10, n)  ) 
		System.out.println(res);
		else System.out.println("-1");
		
	}
}
