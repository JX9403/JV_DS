import java.util.Scanner;

public class B6Frog {
public static void main(String[] args) {
	Scanner sc = new Scanner( System.in);
	
	int a, b, k ;
	
	a = sc.nextInt();
	b = sc.nextInt();
	k = sc.nextInt();
	
	int l, r; 
	if( k % 2 == 0) {
		l = r = k / 2 ;
	} else {
		l = r = k / 2;
		r++;
	}
	
	System.out.println(1l * a * r - 1l * b * l);
}
}
