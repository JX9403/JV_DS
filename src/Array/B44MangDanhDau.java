package Array;

import java.util.Scanner;

public class B44MangDanhDau {
	public static Scanner sc = new Scanner(System.in);
	
	public static int max = 1000001;
	public static void main(String[] args) {
		
		int n = sc.nextInt() ;
		int []  a = new int [n] ;
		int [] d= new int [max] ;
		for( int i = 0; i < n ; i++) {
			a[i] = sc.nextInt() ;
			d[a[i]]++ ;
		}
		
		int cnt = 0;
		for( int i = 0; i < n ; i++) {
			if(d[a[i]] != 0) cnt++ ;
			d[a[i]] = 0;
		}
		System.out.println(cnt);
	}
}
