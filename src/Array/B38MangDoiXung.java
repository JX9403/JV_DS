package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class B38MangDoiXung {
	
	public static Scanner  sc = new Scanner(System.in) ;

	public static int mangDoiXung(int n, int[] a) {
		for(int i = 0; i<= n/2 ; i++ ) {
			if(a[i] != a[n-i - 1]) {
				return 0;
			}
		}
		
		return 1 ;
	}
	
	public static int mangDoiXung2(int n, int[] a) {
		int l = 0, r = n - 1 ;
		
		while( l <= r) {
			if( a[l] != a[r]) {
				return 0;
			}
			l++; r--;
		}
		
		return 1 ;
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		
		for( int  i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		if(mangDoiXung(n, a) == 1) {
			System.out.print("1");
		} else System.out.print("0");
		
	}
}
