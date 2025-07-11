package SoNguyenTo;

import java.util.Scanner;

//Số chỉ có 3 ước là số vừa là nguyên tố, vừa là chính phương
public class B33SoCo3Uoc {
	
//	public static int cp(int x ) {
//		var q = Math.sqrt(x) ;
//		if( q * q == x) return 1 ;
//		return 0 ;
//	}
	
	public static int prime( int n) {
		if( n == 0 || n==1 ) return 0;
		for( int i = 2; i<= Math.sqrt(n) ; i++) {
			if( n % i == 0) return 0;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		long n= sc.nextLong();
		int cnt = 0;
		for( int i = 0; i<= Math.sqrt(n) ; i++) {
			if(prime(i) == 1) {
//				System.out.println(i * i);
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
