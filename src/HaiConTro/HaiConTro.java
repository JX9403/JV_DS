package HaiConTro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HaiConTro {
	public static Scanner sc = new Scanner(System.in);

//	Cho 2 mảng A[] và B[] có N và M phần tử đã được sắp xếp theo thứ tự tăng dần, 
//	nhiệm vụ của bạn là đối với mỗi phần tử trong mảng B[], 
//	hãy đếm xem trong mảng A[] có bao nhiêu phần tử nhỏ hơn nó.
//	6 7
//	1 2 3 5 7 10
//	2 2 2 2 2 2 2

//	1 1 1 1 1 1 1
	public static void smaller() {
		int n = sc.nextInt(), m = sc.nextInt();

		List<Integer> a = new ArrayList<Integer>(n);
		List<Integer> b = new ArrayList<Integer>(m);

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		for (int i = 0; i < m; i++) {
			b.add(sc.nextInt());
		}

		int cnt = 0;
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (a.get(i) >= b.get(j)) {
				System.out.print(i + " ");
				j++;
			} else {
				i++;
			}
		}

		while (j < m) {
			System.out.print(n + " ");
			j++;
		}
	}

//	Cho 2 mảng A[] và B[] có N và M phần tử đã được sắp xếp theo thứ tự tăng dần, 
//	nhiệm vụ của bạn là đối với mỗi phần tử trong mảng B[], 
//	hãy đếm xem trong mảng A[] có bao nhiêu cặp a[i] b[j] bang nhau 
	public static void dem_so_cap_bang_nhau() {
		int n = sc.nextInt(), m = sc.nextInt();

		List<Integer> a = new ArrayList<Integer>(n);
		List<Integer> b = new ArrayList<Integer>(m);

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		for (int i = 0; i < m; i++) {
			b.add(sc.nextInt());
		}

		int ans = 0;
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (a.get(i) == b.get(j)) {
				int cnt1 = 0;
				while (a.get(i) == b.get(j)) {
					cnt1++;
					i++;
				}

				int cnt2 = 0;
				while (a.get(i - 1) == b.get(j)) {
					cnt2++;
					j++;
				}

				ans += 1l * cnt1 * cnt2;

			} else if (a.get(i) < b.get(j)) {
				i++;
			} else {
				j++;
			}
		}

		System.out.println(ans);
	}

//	Cho mang A co n phan tu, tim day ans co do dai lon nhat ma tong <= s
//	11 10
//	3 1 4 1 5 3 4 1 5 2 2 -> 4

	public static void day_con_dai_nhat_tong_nho_hon_s() {

		int n = sc.nextInt(), s = sc.nextInt();

		List<Integer> a = new ArrayList<Integer>(n);

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		int ans = 0, left = 0;

		long sum = 0;

		for (int right = 0; right < a.size(); right++) {
			sum += a.get(right);

			while (sum > s) {
				sum -= a.get(left);
				left++;
			}

			ans = Math.max(ans, right - left + 1);
		}

		System.out.println(ans);
	}

//	tim day con ngan nhat co tong lon hon hoac bang s
//	14 14
//	4 4 5 1 3 1 3 4 1 1 5 4 1 4
	public static void day_con_dai_nhat_tong_lon_hon_hoac_bang_s() {
		int n = sc.nextInt(), s = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int left = 0, ans = 1000000009;
		long sum = 0;

		for (int right = 0; right < n; right++) {
			sum += a[right];
			while (sum >= s) {
				ans = Math.min(ans, right - left + 1);
				sum -= a[left];
				++left;
			}

		}

		if (ans == 1000000009)
			System.out.println("-1");
		else
			System.out.println(ans);

	}

//	Số lượng mảng con có tổng nhỏ hơn s
//	13 14 
//	5 4 5 2 4 5 1 1 2 5 5 2 2 

	public static void so_luong_mang_con_co_tong_nho_hon_s() {
		int n = sc.nextInt(), s = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int l = 0, res = 0, sum = 0;

		for (int r = 0; r < n; r++) {
			sum += a[r];
			while (sum > s) {
				sum -= a[l];
				l++;
			}
			res += r - l + 1;

		}

		System.out.println(res);
	}

//	đếm số lượng mảng con có tổng tối thiếu bằng s, các mảng con liên tiếp, mấy bài trên cũng thía
//	7 20
//	2 6 4 3 6 8 9
//	=> 9

	public static void so_luong_mang_con_co_tong_lon_hon_hoac_bang_s() {
		int n = sc.nextInt(), s = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int l = 0, ans = 0, sum = 0;

		for (int r = 0; r < n; r++) {
			sum += a[r];
			while (sum >= s) {
				ans += n - r ; 
				sum -= a[l] ;
				l++ ;
			}
		}
		
		System.out.println(ans);
	}
	
//	đếm số lượng mảng con có số lượng phần tử khác nhau không vượt quá s
//	11 3
//	5 4 4 5 4 4 2 1 5 2 4
	
	public static void so_luong_day_con_co_so_luong_phan_tu_khac_nhau_nho_hon_hoac_bang_s() {
		int n = sc.nextInt();
        long s = sc.nextLong();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int l = 0, res = Integer.MAX_VALUE ;
        
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        
        for( int r = 0; r < n; r++) {
        	mp.put(a[r], mp.getOrDefault(a[r], 0) + 1);

        	while( mp.size() > s ) {
        		mp.put(a[l], mp.get(a[l]) - 1);
        		if (mp.get(a[l]) == 0) {
                    mp.remove(a[l]);
                }
        		l++;
        	}
        	
        	res = Math.min( res, r - l + 1);
        	
        }
        System.out.println(res);
	}

	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
//		dem_so_cap_bang_nhau();	
//			day_con_dai_nhat_tong_nho_hon_s();
//			day_con_dai_nhat_tong_lon_hon_hoac_bang_s();
//			so_luong_mang_con_co_tong_nho_hon_s();
//			so_luong_mang_con_co_tong_lon_hon_hoac_bang_s();
			so_luong_day_con_co_so_luong_phan_tu_khac_nhau_nho_hon_hoac_bang_s();
		}
	}

}
