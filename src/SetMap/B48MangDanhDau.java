package SetMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.xml.sax.HandlerBase;

public class B48MangDanhDau {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	Map<Integer, Integer> mp = new HashMap();
	
	for( int i = 0; i<n ; i++) {
		int tmp = sc.nextInt();
		mp.put(tmp, mp.getOrDefault(tmp, 0) + 1);
	}
	
	for( var x : mp.entrySet() ) {
		System.out.println(x.getKey() + " " + x.getValue());
	}
}
}
