import java.util.Scanner;

public class DongXu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n, s , res ;

	n = sc.nextInt();
	s = sc.nextInt();
	
	if ( s % n == 0 ) {
		res = s / n;
	} else {
		res = s / n + 1 ;
	}
	
	System.out.print(res);
}
}
