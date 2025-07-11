import java.util.Scanner;

public class B12TongBoiCua3 {
  public static void main(String[] args) {
	
	  int n ; 
	  Scanner sc = new Scanner( System.in);
	  
	  n = sc.nextInt();
	  long sum = 0;
	  
	  for ( int i = 3 ; i <= n ; i += 3) {
		  sum += i ;
	  }
	  System.out.print(sum);
  }
}
