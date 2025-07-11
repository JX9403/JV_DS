import java.util.Scanner;

public class B20SoNguyenTo1 {

	public  static int songuyento(int n) {
		if( n < 2 ) return 0;
		for( int i = 2; i<= Math.sqrt(n); i++) {
			if( n % i == 0) return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(songuyento(n) == 1) {
			System.out.print("YES");
		} else System.out.print("NO");
	}
}
