package SetMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B46TruyVanPhanTuTrongMang {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			s.add(tmp);
		}
		
		int t = sc.nextInt();
		while( t-- > 0) {
			int  x = sc.nextInt();
			if(s.contains(x)) System.out.println("YES"); else System.out.println("NO");
		}
		
	}
}
