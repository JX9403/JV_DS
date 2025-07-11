package SoNguyenTo;

import java.util.Scanner;

//Tuc la 2 so co ucln = 1
public class B32CapSoNguyenToCungNhau {
	public static int gcd(int x, int y) {
		if( y == 0 ) return x;
		return gcd(y, x%y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		for ( int i  = a ; i < b ; i++) {
			for ( int j = a+1 ; j <= b ; j++ ) {
				if(gcd(i, j) == 1) System.out.print(i + " " + j +"\n");
			}
		}
	}
	
}
