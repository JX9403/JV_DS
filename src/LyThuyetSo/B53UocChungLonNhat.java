package LyThuyetSo;

public class B53UocChungLonNhat {
	public static int gcd ( int a, int b) {
		if( b == 0) return a ;
		return gcd(b, a%b) ;
	}
	public static void main(String[] args) {
		
	}
}
