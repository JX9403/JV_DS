package SoNguyenTo;

public class B56BacCuaSoNguyenToTrongNGiaiThua {
	
	public static int count(int n, int p ) {
		int ans = 0 ;
		for( int i  = p ; i <= n ; i+=p ) {
			int tmp = i ;
			
			while(tmp % p == 0) {
				 ans++ ;
				 tmp/=p ;
			}
		}
		return ans ;
	}
	
	public static int count2(int n, int p ) {
		int ans = 0 ;
		for( int i  = p ; i <= n ; i*=p ) {
			ans += n / i ;
		}
		return ans ;
	}
	public static void main(String[] args) {
		
	}

}
