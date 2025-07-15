package LyThuyetSo;

import java.util.Scanner;

public class B57SoLuongUocCuaNGiaiThua {
	
//	n = p1 ^ x1 * p2^x2 *...* pm^xm -> p la so nguyen to
//	so luong uoc cua n! = ( x1+1) * ( x2+1) *... * (xm + 1 )
	
	public static long mod = 10000007 ;
	
	public static long prime( long n ) {
		if( n == 1|| n==0) return 0; 
		for( int i = 2 ; i <= Math.sqrt(n) ; i++) {
			if( n % i == 0) return 0;
		}
		return 1 ;
	}
	
	public static long func( long n, long p) {
		long ans = 0;
		for (long i = p ; i <= n ; i*=p) {
			ans += n/p ;
		}
		return ans ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		long n = sc.nextInt() ;
		
		long ans = 0;
		
		for( long i = 2 ; i <= n ; i++) {
			if( prime(i) == 1) {
				long x = func(n, i);
				ans *= ( x + 1 ) ;
				ans %= mod ;
			}
		}
		
		System.out.println(ans);
	}
}
