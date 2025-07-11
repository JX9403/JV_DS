package LyThuyetDongDu;

import java.util.Scanner;

//  tinh ( a^b) % mod ;
// Thuc chat la a * a * a * a .... % mod
public class B27LuyThua {
	static Scanner sc = new Scanner(System.in) ;
//	static int  mod = 100000007;
			 
	public static void main(String[] args) {
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt() ;
		int sum = 1;
		for ( int i = 0 ; i < b ; i++) {
			sum = ( (sum % c) * a % c ) % c ;
		}
		
		System.out.print(sum);
	}

}
