package MangCongDon;

import java.util.Scanner;

public class B51MangCongDon2Chieu {
	public static Scanner sc = new Scanner(System.in) ;
	public static long [][] pre = new long [1005][1005] ;
	
	public static void mang_cong_don_2_chieu(int n, int m, int[][] a) {
		
		for( int i = 0; i<= n; i++) {
			for( int j = 0; j <= m ; j++) {
				pre[i][j] = 0 ;
			}
		}
		
		for( int i = 1; i<= n; i++) {
			for( int j = 1; j <= m ; j++) {
				pre[i][j] = pre[i-1][j] + pre[i][j-1] - pre[i-1][j-1] + a[i][j] ;
			}
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt(), m = sc.nextInt();
		
		int [][] a = new int[1005][1005] ;
		
		for( int i = 1 ; i<= n; i++ ) {
			for( int j = 1 ; j<= m ; j++) {
				a[i][j] = sc.nextInt() ;
			}
		}
		
		mang_cong_don_2_chieu(n, m, a);
		
	int t = 3; 
	while( t-- > 0 ) {
		
		
		int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt() ;
		
		System.out.println(pre[x2][y2] - pre[x1 - 1][y2] - pre[x2][y1 - 1] + pre[x1-1][y1-1]);
	}
	}
}
