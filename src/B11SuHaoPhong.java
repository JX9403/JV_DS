import java.util.Scanner;

public class B11SuHaoPhong {
public static void main(String[] args) {
	
	int c1, c2, c3, c4, c5 ;
	Scanner sc = new Scanner(System.in);
	c1 = sc.nextInt();
	c2 = sc.nextInt();
	c3 = sc.nextInt();
	c4 = sc.nextInt();
	c5 = sc.nextInt();
	int sum = c1 + c2 + c3 + c4 + c5 ;
	
	if( sum %5 == 0 && sum / 5 != 0 ) {
		System.out.print(sum / 5 );
	} else {
		System.out.print("INVALID" );
	}
}
}
