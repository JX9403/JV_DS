import java.util.Scanner;

public class B8Champion {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a1, a2, a3, b1, b2, b3, n;
	
	a1 = sc.nextInt();
	a2 = sc.nextInt();
	a3 = sc.nextInt();
	b1 = sc.nextInt();
	b2 = sc.nextInt();
	b3 = sc.nextInt();
	n = sc.nextInt();


	
	int cup = a1 +  a2 +  a3 ;
	int hc = b1 + b2 + b3 ;
	
	
	int x, y;
	
	if( cup % 5 == 0) x = cup/5; else x = cup / 5 + 1 ;
	
	if ( hc % 10 == 0 ) y = hc / 10 ; else y = hc/10 + 1 ;
	if( x + y <= n )
	
	System.out.println("YES"); 
	
	else System.out.println("NO");
}
	
	
	

}
