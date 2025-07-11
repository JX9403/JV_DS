import java.util.Scanner;

public class B22SoChinhPhuong {

	public static int sochinhphuong ( int n ) {
		int can = (int)Math.sqrt(n);
		
		if( can * can == n ) return 1; 
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sochinhphuong(n));
		
	}
}
