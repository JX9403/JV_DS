package SapXepTimKiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SapXepTimKiem {
	public static Scanner sc = new Scanner(System.in);

	public static void xep_gach() {
		int n = sc.nextInt();
		Integer[] a = new Integer[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});

		int do_cung = a[0];
		int cnt = 1;

		for (int i = 1; i < n; i++) {
			if (do_cung > 0) {
				cnt++;
				do_cung--;
				do_cung = Math.min(do_cung, a[i]);
			} else {
				break;
			}
		}

		System.out.println(cnt);
	}

	public static void vat_sua_bo() {
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int cnt = 0;

		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});

		for (int i = 0; i < n; i++) {
			if (a[i] - i > 0) {
				cnt += a[i] - i;
			} else {
				break;
			}
		}

		System.out.println(cnt);

	}

//	7 1 
//	2 6 1 7 3 4 9
//	3
	public static void chia_nhom() {
		int n = sc.nextInt(), k = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int cnt = 1;

		Arrays.sort(a);

		for (int i = 1; i < n; i++) {
			if (a[i] - a[i - 1] > k)
				cnt++;
		}

		System.out.println(cnt);
	}

	public static void main(String[] args) {
		int t = 3;
		while (t-- > 0) {
//			xep_gach();
//			vat_sua_bo();
			chia_nhom();
		}
	}

}
