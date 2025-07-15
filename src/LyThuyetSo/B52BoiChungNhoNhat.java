package LyThuyetSo;

public class B52BoiChungNhoNhat {

	public static int gcd( int a, int b ) {
		if( b == 0) return a ;
		return gcd( b, a % b);
	} 
	public  static int lcm (int a, int b) {
		return a / gcd( a, b ) * b ; 

	}
	
	public static void main(String[] args) {
		
	}
}
