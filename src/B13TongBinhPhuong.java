import java.util.Scanner;

public class B13TongBinhPhuong {
	
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in) ;
		
		n = sc.nextInt();
		
		long sum =  0 ;
		
		for ( int i = 0; i <= n ; i++) {
			sum += 1l * i * i ;
		}
		
		System.out.print(sum);
	}

}
