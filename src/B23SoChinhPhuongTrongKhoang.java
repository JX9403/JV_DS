import java.util.Scanner;

public class B23SoChinhPhuongTrongKhoang {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int l = sc.nextInt() , r = sc.nextInt();
	int min, max ; 
	int q = (int) Math.sqrt(l) ;
	if( q * q == l) min = q ; else min = q+ 1;
	
	max = (int) Math.sqrt(r) ;
	
	for( int i = min; i <= max ; i++ ) {
		System.out.print(1l * i * i + " ");
	}
	
}
}
 