package XauKyTu;

import java.awt.print.Printable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class XauKyTu {

	public static Scanner sc = new Scanner(System.in);

	public static int xau_thuan_nghich(String s) {
		String tmp = new String();
		for (int i = s.length() - 1; i >= 0; i--) {
			tmp += s.charAt(i);
		}
		if (s.equals(tmp))
			return 1;
		else
			return 0;
	}

	public static void sap_xep_xau_thuan_nghich() {
		String s = sc.nextLine();

		String[] ls = s.split("\\s+");
		List<String> ans = new ArrayList<String>();

		for (int i = 0; i < ls.length; i++) {
			if (xau_thuan_nghich(ls[i]) == 1) {
				ans.add(ls[i]);
			}
		}

		Collections.sort(ans, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});

		Set<String> se = new LinkedHashSet();

		for (int i = 0; i < ans.size(); i++) {
			se.add(ans.get(i));
		}

		for (String x : se) {
			System.out.println(x);
		}
	}

//	bb aa bb cc aa bb cc
	public static void sap_xep_xau_cung_tan_xuat_theo_thu_tu_xuat_hien() {

		String s = sc.nextLine();

		String[] ls = s.split("\\s+");

		Map<String, Integer> mp = new TreeMap<String, Integer>();

		for (int i = 0; i < ls.length; i++) {
			mp.put(ls[i], mp.getOrDefault(ls[i], 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println();

		Set<String> se = new LinkedHashSet<String>();

		for (int i = 0; i < ls.length; i++) {
			se.add(ls[i]);
		}

		for (String x : se) {
			System.out.println(x + " " + mp.get(x));
		}

	}

//	aa bb cc aa bb aa aa cc
	public static void tu_xuat_hien_nhieu_nhat_it_nhat() {
		String s = sc.nextLine();

		String[] ls = s.split("\\s+");

		Map<String, Integer> mp = new TreeMap<String, Integer>();

		for (int i = 0; i < ls.length; i++) {
			mp.put(ls[i], mp.getOrDefault(ls[i], 0) + 1);
		}

		int max_fre = Integer.MIN_VALUE;
		int min_fre = Integer.MAX_VALUE;
		String max = ls[0];
		String min = ls[0];

		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > max_fre)
				max_fre = entry.getValue();
			if (entry.getValue() < min_fre)
				min_fre = entry.getValue();
		}

		List<String> ls_max = new ArrayList<String>();

		List<String> ls_min = new ArrayList<String>();

		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			if (entry.getValue() == max_fre) {
				ls_max.add(entry.getKey());
			}
			if (entry.getValue() == min_fre) {
				ls_min.add(entry.getKey());
			}
		}

		System.out.println(ls_max.getLast() + " " + mp.get(ls_max.getLast()));
		System.out.println(ls_min.getLast() + " " + mp.get(ls_min.getLast()));
	}

//	aabcacbda
//	cacb
//	YES
	public static void kiem_tra_xau_con() {
		String s = sc.nextLine();

		String t = sc.nextLine();

		if (s.contains(t))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static String chuan_hoa_ten(String s) {
		String ans = s.toLowerCase().substring(1);
		char tmp = Character.toUpperCase(s.charAt(0));
		String res = tmp + ans;

		return res;
	}

	public static String chuan_hoa_tuoi(String s) {
		String res = "";
		if (s.charAt(1) == '/') {
			s = "0" + s;
			res = s;
		}
		if (s.charAt(4) == '/') {

			String ans1 = s.substring(0, 3);
			String ans2 = s.substring(3, s.length());

			res = ans1 + "0" + ans2;

		}
		return res;

	}

	public static void chuan_hoa_ten_tuoi() {
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		String res1 = "";

		String[] ls1 = s1.split("\\s+");

		for (int i = 0; i < ls1.length; i++) {
			if (i != ls1.length - 1) {
				res1 += chuan_hoa_ten(ls1[i]) + " ";
			} else {
				res1 += chuan_hoa_ten(ls1[i]);
			}
		}

		System.out.println(res1);
		System.out.println(chuan_hoa_tuoi(s2));

	}
	
	public static void xau_con_lien_tiep() {
		String s = sc.nextLine();
		
		List<String> ls = new ArrayList<String>();
		for( int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			
			String tmp = "";
			
			while( i < s.length() && c == s.charAt(i)) {
				tmp += s.charAt(i);
				i++;
			}
			
			ls.add(tmp);
			i--;
		}
		for( int j = 0 ; j < ls.size() ; j++) {
			System.out.println(ls.get(j));
		}
	}

	public static void xau_con_lien_tiep2() {
		String s = sc.nextLine();
		
		List<String> ls = new ArrayList<String>();
		for( int i = 1 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			
			String tmp = "";
			
			while( i < s.length() && s.charAt(i - 1) == s.charAt(i)) {
				tmp += String.valueOf(s.charAt(i -1)) +  String.valueOf(s.charAt(i));
				i++;
			}
			
			ls.add(tmp);
			i--;
		}
		for( int j = 0 ; j < ls.size() ; j++) {
			System.out.println(ls.get(j));
		}
	}

	public static void main(String[] args) {
//		sap_xep_xau_thuan_nghich();
//		sap_xep_xau_cung_tan_xuat_theo_thu_tu_xuat_hien();
//		tu_xuat_hien_nhieu_nhat_it_nhat();
//		kiem_tra_xau_con();
//		chuan_hoa_ten_tuoi();

		xau_con_lien_tiep2();
	}
}
