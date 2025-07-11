package Array;

import java.util.Scanner;

public class B42MangCongDon {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt() ;
		int [] a= new int[n+1] ;
		for( int i = 1 ; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		int [] f = new int[n+1];
		for( int i = 0; i<= n; i++) {
			f[i] = 0;
		}
		
		for( int i = 1 ; i<= n;i++) {
			f[i] = f[i-1] + a[i] ;
		}
		
		for( int i = 1; i<= n ; i++ ) {
			System.out.print(f[i] + " ");
		}
	}
}
