package SoNguyenTo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B35PhantTichThuaSoNguyenTo {
	
	public static int max = 10000000 ;
	
	public static Integer[] p = new Integer[max+1] ;
//	Sang de lay uoc so nguyen to nho nhat
	public static void sang() {
		for ( int i = 0; i <= max ; i++) {
			p[i] = i ;
		}
		
		for (int i = 2 ; i <= Math.sqrt(max) ; i ++ ) {
			if(p[i] == i) {
//				Bước này xét bội của i, thì i chính là ước nhỏ nhất 
				for( int j = i * i ; j<= max ; j+= i) {
					p[j] = i ; 
				}
			}
		}
		
	}
	public static void factorize(int n) {
		  Map<Integer, Integer> mp = new HashMap<>();
		 
		  while(n != 1) {
			 mp.put(p[n], mp.getOrDefault(n, 0) + 1) ;
			  n/=p[n];
		  }
		  
		 for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			 System.out.println(entry.getKey() + "^" + entry.getValue());
		 }
			 
	}
//	Vowis cac so lon hon 10^7
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for( int i = 2; i<=Math.sqrt(n) ; i++) {
		if(n%i==0) {
			int p = 0;
			while(n % i == 0) {
				p++;
				n/=i;
			} System.out.print(i + "^" + p + " * " );
		}
	}
	
	if(n!=1) {
		System.out.println(n);
	}
}
}
