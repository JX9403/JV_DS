package SetMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B45PhanTuPhanBiet {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			s.add(tmp);
		}
		System.out.print(s.size());
	}

}
