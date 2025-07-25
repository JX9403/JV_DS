package MangCongDon;

import java.util.Scanner;

public class B60MangHieu {

	public static int n ;
	public static int[] a = new int[100005];
	
	public static long[]d = new long[100005];
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		for(int i = 0; i < n ; i++) {
			if( i == 0 ) d[0] = a[0] ;
			else d[i] = (long)( a[i] - a[i-1]) ;
		}
	}
}
