package SoNguyenTo;

import java.util.Scanner;

public class B36BacCuaThuaSoNguyenToTrongNGiaiThua {
	
	public static Scanner sc = new Scanner(System.in) ;
	public static long mod = 10000007 ;
	
	public static long cnt(long n, long p) {
		long init = p;
		long res = 0 ;
		
		while( p <= n ) {
			res = (res % mod +  (n/p)% mod) % mod ;
			p*= init;
		}
		
		return res ;
		
	}
	
	
	public static void main(String[] args) {
		long n = sc.nextLong();
//		long p = sc.nextLong();
		
		long x = cnt( n, 2) ;
		long y = cnt(n , 5) ;
		
		System.out.print(Math.min(x, y));
	}
}
