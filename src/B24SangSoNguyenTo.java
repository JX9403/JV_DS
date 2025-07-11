import java.util.Scanner;

public class B24SangSoNguyenTo {
	
	
	static final int max = 1000000 ;
	static boolean[] p = new boolean[max + 1];
	
	public static void sangSoNgto() {
		for ( int i = 0 ; i <= max ; i++) {
			p[i] = true ;
		}
		p[0] = false;
		p[1] = false ;
		
		for ( int i = 2; i<= Math.sqrt(max) ; i++) {
			if( p[i] == true ) {
				for ( int j = i*i ; j<= 1000000; j+=i) {
					p[j] = false ; 
				}
			}
		}
		
	}
	
	

//	Đảm bảo r - l < 10^6
	public static void sangSoNgto2(long l, long r) {
		boolean[] p2 = new boolean[(int)(r - l + 1)];
		for ( int i = 0 ; i <= r - l  ; i++) {
			p2[i] = true ;
		}
		
		for ( int i = 2; i<= Math.sqrt(max) ; i++) {
			if( p2[i] == true ) { 
				for ( long j = Math.max(i*i*1l, (l + i - 1 ) / i *i ) ; j<= r; j+=i) {
					p2[(int)(j - l)] = false ; 
				}
			}
		}
		
		
		 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(p[n] == true) System.out.print("YES"); else System.out.print("NO");
	}

}
