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

		

	}

	public static void main(String[] args) {
//		sap_xep_xau_thuan_nghich();
//		sap_xep_xau_cung_tan_xuat_theo_thu_tu_xuat_hien();

	}
}
