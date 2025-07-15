package SetMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class B49MangDanhDau3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Map<Integer, Integer>  mp = new LinkedHashMap<Integer, Integer>();
		for( int i = 0; i< n; i++) {
			int tmp = sc.nextInt();
			mp.put(tmp, mp.getOrDefault(tmp, 0)+1 ) ;
		}
		
		for( Map.Entry<Integer, Integer> x : mp.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}
}
