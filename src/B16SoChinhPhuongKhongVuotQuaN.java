import java.util.Scanner;

public class B16SoChinhPhuongKhongVuotQuaN {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n= sc.nextInt();
	
	for ( long i = 1; i <= Math.sqrt(n) ; i++) {
		System.out.print(i*i + " ");
	}
}
}
