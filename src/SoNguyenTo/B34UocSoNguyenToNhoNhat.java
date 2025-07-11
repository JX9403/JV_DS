package SoNguyenTo;

import java.util.Scanner;

public class B34UocSoNguyenToNhoNhat {
	
	public static int max = 10000000 ;
	
	public static int[] p = new int[max+1] ;
//	Sang de lay uoc so nguyen to nho nhat
	public static void sang() {
		for ( int i = 0; i <= max ; i++) {
			p[i] = i ;
		}
		
		for (int i = 2 ; i <= Math.sqrt(max) ; i ++ ) {
			if(p[i] == i) {
//				Bước này xét bội của i, thì i chính là ước nhỏ nhất 
				for( int j = i * 2 ; j<= max ; j+= i) {
					p[j] = i ; 
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sang();
		for( int i = 1; i<= n ; i++) {
			System.out.println(p[i]);
		}
	}
}
