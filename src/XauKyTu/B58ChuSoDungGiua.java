package XauKyTu;

import java.util.Scanner;

public class B58ChuSoDungGiua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		String s = sc.nextLine();
		
		if( s.length() % 2 == 1) {
			System.out.println(s.charAt(s.length()/2));
		} else {
			System.out.println("NONE");
		}
		
	}
}
