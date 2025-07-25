package HaiConTro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HaiConTro {
	public static Scanner sc = new Scanner(System.in) ;
	
//	Cho 2 mảng A[] và B[] có N và M phần tử đã được sắp xếp theo thứ tự tăng dần, nhiệm vụ của bạn là đối với mỗi phần tử trong mảng B[], hãy đếm xem trong mảng A[] có bao nhiêu phần tử nhỏ hơn nó.
//	6 7
//	1 2 3 5 7 10
//	2 2 2 2 2 2 2
	
//	1 1 1 1 1 1 1
	public static void smaller() {
		int n = sc.nextInt(), m = sc.nextInt() ;
		
		List<Integer> a = new ArrayList<Integer>(n) ;
		List<Integer> b = new ArrayList<Integer>(m) ;
		
		for( int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		
		for( int i = 0; i < m; i++) {
			b.add(sc.nextInt());
		}
		
		int cnt = 0;
		int i = 0, j = 0;
		while( i < n && j < m ) {
			if( a.get(i) >= b.get(j)) {
				System.out.print(i + " ");
				j++;
			} else {
				j++ ;
			}
		}
		
		while( j < m ) {
			System.out.print(n + " ");
			j++;
		}
	}
	
	public static void main(String[] args) {
		int t = sc.nextInt() ;
		while( t-- > 0) {
			
		}
	}

}
