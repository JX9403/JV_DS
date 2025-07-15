package SoNguyenTo;

import java.util.Scanner;

public class B55SangSoNguyenToTrenDoan {
	
	public static void sang (int l, int r ) {
		int [] p = new int [ r - l + 1] ;
		
		for( int i = 0 ; i < r - l + 1  ; i++) {
			p[i] = 1;
		}
		
		for( int i = 2; i <= Math.sqrt(r) ; i++) {
			for( int j = Math.max ( i * i , (l+i-1)/ i * i ) ; j <= r ; j += i ) {
				p[j - l] = 0 ;
			}
		}
		
		for( int i = Math.max(l,2) ; i<= r ; i++) {
			if( p[i - l] == 1) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int l = sc.nextInt(), r = sc.nextInt();
		sang(l, r) ;
	}

}
