package SetMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class B47LietKeTheoThuTuXuatHien {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			s.add(tmp);
		}
		
		for( int x : s) {
			System.out.print(x+" ");
		}
		
	}
}
