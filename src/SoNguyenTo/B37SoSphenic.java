package SoNguyenTo;

import java.util.Scanner;

public class B37SoSphenic {
	
	public static long max = 10000001 ;
	
	public static long count ( long n, long p ) {
		long init = p ;
		long res = 0;
		while ( p <= n) {	
			res = res + n/p ;
			p*= init;
		}
		return res ;
	}
	
	public static int solve( long n) {
		int dem = 0;
		for( long i = 2; i<= Math.sqrt(n) ; i++) {
			if(n%i == 0) {
				long cnt = 0;
				while(n % i == 0) {
					cnt++ ;
					n/=i ;
				}
				
				
				if( cnt > 1) return 0 ;
				if(cnt == 1) dem++;
			}
			
		}
		if( n != 1) dem++ ;
		if( dem > 3 ) return 0;
		return 1 ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		long n = sc.nextLong();
		if( solve(n) == 1 )System.out.print("YES") ; else System.out.print("NO");
		
	
	}

}
