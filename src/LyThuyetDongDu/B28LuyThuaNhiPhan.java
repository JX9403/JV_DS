package LyThuyetDongDu;


public class B28LuyThuaNhiPhan {
//	 a ^ b toc do nhanh hon
	

	public static long binpow ( long a, long b) {
		if( b == 0) return 1;
		
		long x = binpow(a, b/2) ;
		
		if( b % 2 == 0) return x * x ;
		else return x * x * a ;
	}
	
//	a ^ b chia du cho c
	public static long binpow2 ( long a, long b, long c) {
		if( b == 0) return 1;
		
		long x = binpow2(a, b/2, c) ;
		
		if( b % 2 == 0) return (( x % c ) * (x % c)) % c ;
		else return (( x % c ) * (x % c) * ( a % c)) % c;
	}
}
