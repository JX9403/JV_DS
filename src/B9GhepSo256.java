import java.util.Scanner;

public class B9GhepSo256 {
	public static void main(String[] args) {
		int k2, k3, k5 , k6 ;
		Scanner sc = new Scanner(System.in);
		
		k2 = sc.nextInt();
		k3 = sc.nextInt();
		k5 = sc.nextInt();
		k6 = sc.nextInt();
		
		int k256 = min(k2, k5, k6) ; 
		
		int k32 = min(k2 - k256, k3) ;
		
		System.out.print( 1l * 256 * k256 + 32 * k32 );
		
	}
	
	public static int min (int... nums) {
		if( nums.length == 0 )  if (nums.length == 0) throw new IllegalArgumentException("No arguments");
		int m = nums[0] ;
		for ( int x : nums ) {
			m = Math.min(m, x);
		}
		return m;
	}

}
