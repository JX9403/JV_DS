package Array;

import java.util.Scanner;

public class B43CuaSoTruot {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt(), k = sc.nextInt();
		int [] a = new int [n] ;
		
		for( int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		
		int s = 0; 
		for( int i = 0; i<k;i++) {
			s += a[i] ;
		}
		
		System.out.println(s);
		
		for( int i = k ; i < n; i++) {
			s = s - a[i - k] + a[i] ; 
			System.out.println(s);
		}
	}
}
