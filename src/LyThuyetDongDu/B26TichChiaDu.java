package LyThuyetDongDu;

import java.util.Scanner;

public class B26TichChiaDu {
	
	 static Scanner sc= new Scanner(System.in);
	
	 public static void main(String[] args) {
		int n = sc.nextInt();
		
		int r = 1000000000 + 7 ;
		
		int s = 0 ; 
		for ( int i = 0 ; i < n ; i++) {
			int tmp = sc.nextInt();
//			s += tmp ;
//			s%=r ;
			
			s = (( s % r ) * (tmp % r )) % r ;
		}
		System.out.print(s);
	}
	

}
