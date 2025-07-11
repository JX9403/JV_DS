package SoNguyenTo;


import java.util.Scanner;

public class B31SoThuanNguyenTo {

	public static int isAllPrime ( int x ) {
		int sum = 0;
		while (x != 0) {
			int r = x % 10 ;
			if (r != 2 && r != 3 && r != 5 && r != 7) {
                return 0;
            }
			sum+= r;
			x/= 10;
		}
		if(isPrime(sum) == 0) return 0;
		return 1 ;
	}
	
	public static int isPrime( int n ) {
		if( n == 0 || n == 1) return 0;
		for( int i = 2; i <= Math.sqrt(n) ; i++ ) {
			if( n % i == 0) {
				 return 0;
			}
		}
		return  1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		int cnt = 0; 
		for ( int i = a ; i <= b; i++) {
			 if( isAllPrime(i) == 1  && isPrime(i) == 1) {
				 cnt++ ;
				 
			 }
		}
		System.out.print(cnt);
	}
}
