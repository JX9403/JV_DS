package Array;

import java.util.Scanner;

public class B40LatNguocMang {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int [] a = new int [n] ;
		
		for( int i = 0; i< n ; i++) {
			a[i] = sc.nextInt();
		}
		
		for( int i = 0; i< n/2; i++) {
			int tmp ;
			tmp = a[i] ;
			a[i] = a[n-i-1];
			a[n-i-1] = tmp ;
		}
		
		for( int i = 0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
