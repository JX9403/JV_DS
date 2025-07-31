package SapXepTimKiem;

import java.util.Scanner;

public class BinarySearch {
	
	public static Scanner sc = new Scanner(System.in) ;
//	mảng A đã được sắp xếp theo tt tăng dần
	
//  Tìm vị trí đầu tiên  của phần tử X trng mảng, nếu ko tồn tại x in ra -1 
	
	public static void vi_tri_dau_tien_cua_x() {
		int n = sc.nextInt() ;
		int x = sc.nextInt();
		int res = -1 ;
		
		int [] a = new int [n] ;
		
		for( int i = 0; i < n ; i ++) a[i] = sc.nextInt() ;
		
		int l = 0, r = n - 1 ;
		
		while ( l <= r ) {
			int m = ( l + r ) / 2 ;
			
			if( a[m] == x) {
				res = m ;
				r = m - 1 ;
			} else if( a[m] < x ) {
				l = m + 1 ;
			} else { 
				r = m - 1 ;
			}
		}
		
		System.out.println(res);
	}
	
	
	
//	Tìm vị trí xuất hiện cuối cùng của phần tử X trong mảng  nếu k in ra -1
	public static void vi_tri_cuoi_cung_cua_x() {
		int n = sc.nextInt() ;
		int x = sc.nextInt();
		
		int [] a = new int [n] ;
		
		for( int i = 0; i < n ; i ++) a[i] = sc.nextInt() ;
		
		int l = 0, r = n - 1 ;
		int res = -1 ;
		
		while ( l <= r ) {
			int m = ( l + r ) / 2 ;
			
			if( a[m] == x) {
				res = m ;
				l = m + 1 ;
			} else if( a[m] < x ) {
				l = m + 1 ;
			} else { 
				r = m - 1 ;
			}
		}
		
		System.out.println(res);
	}
	
	
//	Tìm vị trí xuất hiện đầu tiên của phần tử >= X trong mảng, nếu ko tồn tại in ra -1
	
	public static void vi_tri_dau_tien_lon_hon_bang_x() {
		int n = sc.nextInt() ;
		int x = sc.nextInt();
		
		int [] a = new int [n] ;
		
		for( int i = 0; i < n ; i ++) a[i] = sc.nextInt() ;
		
		int l = 0, r = n - 1 ;
		int res = -1 ;
		
		while ( l <= r ) {
			int m = ( l + r ) / 2 ;
			
			if( a[m] >=  x) {
				res = m ;
				r = m - 1 ;
			} else { 
				l = m + 1 ;
			}
		}
		
		System.out.println(res);
	}
	
//	Tìm vị trí xuất hiện đầu tiên của phần tử  > X trong mảng
	public static void vi_tri_cuoi_cung_lon_hon_x() {
		int n = sc.nextInt() ;
		int x = sc.nextInt();
		
		int [] a = new int [n] ;
		
		for( int i = 0; i < n ; i ++) a[i] = sc.nextInt() ;
		
		int l = 0, r = n - 1 ;
		int res = -1 ;
		
		while ( l <= r ) {
			int m = ( l + r ) / 2 ;
			
			if( a[m] >  x) {
				res = m ;
				r = m - 1 ;
			} else { 
				l = m + 1 ;
			}
		}
		
		System.out.println(res);
	}
	
//	Tim so lan xuat hien cua X trong mang -> lay cuoi - dau + 1
	
	
//	10 1160
//	19 1600 2172 2921 3409 4185 4639 6098 6744 9192
	public static void main(String[] args) {
		int t = 3;
		while( t-- > 0 ) {
			vi_tri_dau_tien_cua_x();
			vi_tri_cuoi_cung_cua_x();
			vi_tri_dau_tien_lon_hon_bang_x();
			vi_tri_cuoi_cung_lon_hon_x();
			
			
		}
	}

}
