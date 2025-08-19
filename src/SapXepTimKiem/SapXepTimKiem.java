package SapXepTimKiem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SapXepTimKiem {

	public static class Pair {
		int first, second;

		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

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

	public static void ALGOPRO7() {
		int n = sc.nextInt(), k = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		Arrays.sort(a);

		System.out.println(a[k]);
	}

//	6
//	3 8
//	9 12
//	6 10
//	1 4
//	2 7
//	11 14

	public static void sap_xep_show_dien() {
		int n = sc.nextInt();
		Pair[] a = new Pair[n];
		for (int i = 0; i < n; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			a[i] = new Pair(first, second);
		}

		Arrays.sort(a, (p1, p2) -> {
			return Integer.compare(p1.second, p2.second);
		});

		int cnt = 1, tmp = a[0].second;
		for (int i = 1; i < n; i++) {
			if (a[i].first > tmp) {
				cnt++;
				tmp = a[i].second;
			}
		}
		System.out.println(cnt);
	}

//	 4 4 
//	 2 2 2 2 
	public static void dem_cap_so_co_tong_bang_nhau() {
		int n = sc.nextInt(), s = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		long cnt = 0;
		int i = 0, j = n - 1;

		while (i < j) {
			int sum = a[i] + a[j];
			if (sum == s) {
				int x = a[i], y = a[j];

				int d1 = 0, d2 = 0;

				while (i < n && a[i] == x) {
					d1++;
					i++;
				}
				while (j >= 0 && a[j] == y) {
					d2++;
					j--;
				}
				if (x == y)
					cnt += (long) d1 * (d2 - 1) / 2;
				else
					cnt += (long) d1 * d2;
			} else if (sum < s)
				i++;
			else
				j--;
		}
		System.out.println(cnt);
	}

	public static int last_pos(int[] a, int l, int r, int x) {
		int res = -1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] < x) {
				res = mid;
				l = mid + 1;
			} else
				r = mid - 1;
		}
		return res;
	}

	public static int first_pos(int[] a, int l, int r, int x) {
		int res = -1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] > x) {
				res = m;
				r = m - 1;

			} else {
				l = m + 1;
			}
		}
		return res;
	}

//	4 5 2 2 2 2
//	6

	public static void dem_cap_so_co_tong_nho_hon_k() {
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		long cnt = 0;
		for (int i = 0; i < n; i++) {
			int t = last_pos(a, i + 1, n - 1, k - a[i]);
			if (t != -1)
				cnt += t - i;
		}
		System.out.println(cnt);
	}

	public static void dem_cap_so_co_tong_lon_hon_k() {
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		long cnt = 0;

		for (int i = 0; i < n; i++) {
			int t = first_pos(a, i + 1, n - 1, k - a[i]);
			if (t != -1)
				cnt += n - t;
		}
		System.out.println(cnt);
	}

//	3 5
//	1 2 3
//	1 2 9 5 3
//	1 2 3 
//	1 2 3 5 9 
//	trong truong hop cac phan tu trong mang khac nhau
	public static void mang_giao_hop() {
		int n = sc.nextInt(), m = sc.nextInt();
		int[] a = new int[n], b = new int[m];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		List<Integer> giao = new ArrayList<Integer>(), hop = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (a[i] == b[j]) {
				giao.add(a[i]);
				hop.add(a[i]);
				i++;
				j++;
			} else if (a[i] > b[j]) {
				hop.add(b[j]);
				j++;
			} else {
				hop.add(a[i]);
				i++;
			}
		}

		while (i < n)
			hop.add(a[i++]);
		while (j < m)
			hop.add(b[j++]);

		for (int x : giao) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : hop) {
			System.out.print(x + " ");
		}
	}

//	sap xep phan tu theo tan xuats

//	10 
//	6 8 4 10 3 4 10 2 4 1
	public static void sap_xep_theo_tan_xuat() {
		int d[] = new int[1000005];

		int n = sc.nextInt();
		Integer a[] = new Integer[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			d[a[i]]++;
		}

		Integer b[] = Arrays.copyOf(a, n);
//		tan xuat nhieu hon -> truoc , nho hon -> truoc
		Arrays.sort(a, (x, y) -> {
			if (d[x] != d[y])
				return Integer.compare(d[y], d[x]);
			else
				return Integer.compare(x, y);
		});

//		tan xuat nhieu hon -> truoc, so xuat hien truoc -> truoc, tuc la in het so day ra, roi moi den cac so tiep theo 
		Arrays.sort(b, (x, y) -> {

			return Integer.compare(d[y], d[x]);

		});

		for (Integer x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (Integer x : b) {
			if (d[x] > 0) {
				for (int i = 0; i < d[x]; i++) {
					System.out.print(x + " ");
				}
				d[x] = 0;
			}
		}
	}

//	6 3
//	9560 5571 9008 3649 1473 3782
//	9560 9008 5571 3782 3649 1473 
//	22799
	public static void bieu_thuc_lon_nhat() {
		int n = sc.nextInt(), k = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a, 1, n, (x, y) -> Integer.compare(y, x));

		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		int sum = a[0];
		for (int i = 1; i < n; i++) {
			if (i <= k)
				sum += a[i];
			else
				sum -= a[i];
		}
		System.out.println(sum);
	}

	public static void checkin_san_bay() {
		int n = sc.nextInt();
		Pair[] a = new Pair[n];

		for (int i = 0; i < n; i++) {
			int f = sc.nextInt(), s = sc.nextInt();
			a[i] = new Pair(f, s);
		}

		Arrays.sort(a, (p1, p2) -> Integer.compare(p1.first, p2.first));

		int sum = a[0].first + a[0].second;

		for (int i = 1; i < n; i++) {

			if (a[i].first > sum) {
				sum = a[i].first + a[i].second;
			} else
				sum += a[i].second;
		}

		System.out.println(sum);
	}

	public static int bi_search(int[] a, int l, int r, int x) {

		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] == x) {
				return 1;
			} else if (a[m] > x) {

				r = m - 1;
			} else {

				l = m + 1;
			}
		}
		return 0;
	}

//	5 3
//	1 1 2 3 5

	public static void tim_cap_so_co_hieu_bang_x() {
		int n = sc.nextInt(), x = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		for (int i = 0; i < n; i++) {
			int res = bi_search(a, i + 1, n - 1, x + a[i]);
			if (res == 1) {
				System.out.println(res);
				return;
			}
		}

		System.out.println("0");
	}

//	So nho nhat lon hon a[i]
//	Tim so dau tien lon hon a[i]

	public static int dautien_lonhon(int[] a, int l, int r, int x) {
		int res = -1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (a[m] > x) {
				res = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return res;
	}

	public static void so_nho_nhat_lon_hon_ai() {
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}

		Arrays.sort(b);

		for (int i = 0; i < n; i++) {
			int tmp = dautien_lonhon(b, 0, n - 1, a[i]);
			if (tmp == -1) {
				System.out.print("_ ");
			} else {
				System.out.print(b[tmp] + " ");
			}
		}
	}

	public static void den_long() {
		int n = sc.nextInt(), l = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		double ans = 0;

		Arrays.sort(a);
		for (int i = 1; i < n; i++) {
			ans = Math.max((a[i] - a[i - 1]), ans);
		}

		ans = Math.max(a[0] * 2, ans);
		ans = Math.max(ans, (l - a[n - 1]) * 2);

		BigDecimal res = new BigDecimal(ans / 2);

		System.out.println(res.setScale(10, RoundingMode.HALF_EVEN));

	}

	public static void dragon() {
		int n = sc.nextInt(), s = sc.nextInt();
		Pair[] a = new Pair[n];
		for (int i = 0; i < n; i++) {
			int fi = sc.nextInt(), se = sc.nextInt();
			a[i] = new Pair(fi, se);
		}

		Arrays.sort(a, (x, y) -> {
			return Integer.compare(x.first, y.first);
		});

		for (int i = 0; i < n; i++) {
			if (s > a[i].first) {
				s += a[i].second;
			} else {
				System.out.println("0");
				return;
			}
			;
		}
		System.out.println("1");

	}

//	4 5
//	1 4 6 2
//	5 1 5 7 9
//	3

	public static void bat_cap_khieu_vu() {
		int n = sc.nextInt(), m = sc.nextInt();
		int a[] = new int[n];
		int[] b = new int[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();

		Arrays.sort(a);
		Arrays.sort(b);
		int cnt = 0;

		int i = 0, j = 0;

		while (i < n && j < m) {
			if (Math.abs(a[i] - b[j]) <= 1) {
				cnt++;
				j++;
				i++;
			} else if (a[i] < b[j]) {
				i++;
			} else
				j++;
		}

		System.out.println(cnt);
	}

	public static void can_ho() {
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();

		Arrays.sort(a);
		Arrays.sort(b);

		int ans = 0;
		int i = 0, j = 0;

		while (i < n && j < m) {
			if (Math.abs(a[i] - b[j]) <= k) {
				ans++;
				j++;
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else
				i++;
		}

		System.out.println(ans);
	}
//
//	4 10
//	7 2 3 9
//	3
	public static void xep_tre() {
		int n = sc.nextInt(), x = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		Arrays.sort(a);

		int cnt = 0;

		int i = 0, j = n - 1;
		while (i <= j) {
			if (a[i] + a[j] <= x) {
				cnt++;
				i++;
				j--;
			} else {
				cnt++;
				j--;
			}
		}
		
		System.out.println(cnt);
	}
//	4
//	1 10
//	2 4
//	3 5
//	7 9
//	3
	public static void cua_hang_ban_ron() {
		int n = sc.nextInt();
		Pair [] a = new Pair [n] ;
		List<Pair> p = new ArrayList<SapXepTimKiem.Pair>();
		
		for( int i = 0; i < n ; i++ ) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			p.add(new Pair(x, 1));
			p.add(new Pair(y, -1));
			
		}
		
		Collections.sort(p, (f, s) -> {
			return Integer.compare(f.first, s.first);
		} );
		
		int ans = 1, cnt = 0;
		for( int i = 0 ; i < p.size() ; i++) {
			cnt+= p.get(i).second ;
			ans =  Math.max( ans, cnt) ;
		}
		System.out.println(ans);
	}
	
//	la bai xep lich thoi, sap xep theo second ( thoi gian ket thuc ) la duoc
	public static void lien_hoan_phim() {
		int n = sc.nextInt();
		List<Pair> p = new ArrayList<SapXepTimKiem.Pair>();
		for( int i = 0; i < n; i++) {
			int f = sc.nextInt(), s = sc.nextInt();
			p.add(new Pair(f, s));
		}
		
		Collections.sort(p, (p1, p2) -> {
			return Integer.compare(p1.second, p2.second);
		});
		
		int time = p.get(0).second , res = 1;
		
		for( int i = 1 ; i < n ; i++) {
			if ( time <= p.get(i).first ) {
				time = p.get(i).second ;
				res++;
			}
		}
		
		System.out.println(res);
		
	}
	
	

	public static void main(String[] args) {

//			ALGOPRO7();
//		sap_xep_show_dien();
//		dem_cap_so_co_tong_bang_nhau();
//		dem_cap_so_co_tong_nho_hon_k();
//		dem_cap_so_co_tong_lon_hon_k();
//		mang_giao_hop();
//		sap_xep_theo_tan_xuat();
//		bieu_thuc_lon_nhat();
//		checkin_san_bay();
//		tim_cap_so_co_hieu_bang_x();
//		so_nho_nhat_lon_hon_ai();
//		den_long();

//		dragon();

//		bat_cap_khieu_vu();
//		can_ho();
//		xep_tre();
//		cua_hang_ban_ron();
		lien_hoan_phim();
	}

}
