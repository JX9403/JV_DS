package SoNguyenTo;

import java.util.Scanner;

public class B30GoldbachConjecture {
	static final int max = 10000000 ;
	static int p[] = new int [max + 1] ;
	
	public static void prime () {
		for( int i = 0; i <= max ; i++) {
			p[i] = 1;
		}
		p[0] = p[1] = 0;
		for( int i = 2 ; i <= Math.sqrt(max) ; i++) {
			if(p[i] == 1) {
				for ( int j = i*i ; j < max ; j+=i) {
					p[j] = 0 ;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		prime();
		for (int i = 2 ; i<= n/2 ; i++) {
			if( p[i] == 1 && p[n-i] == 1) {
				System.out.print(i + " ");
				System.out.print(n-i);
				System.out.println();
			}
		}
	}
}
