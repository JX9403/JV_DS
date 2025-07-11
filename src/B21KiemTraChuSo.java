import java.util.Scanner;

public class B21KiemTraChuSo {
	public static int tongchuso(int n) {
		int s = 0;
		while (n != 0) {
			int r = n % 10;
			s += r;
			n /= 10;

		}
		return s;
	}

	public static int tongchusochan(int n) {
		int s = 0;
		while (n != 0) {
			int r = n % 10;
			if (r % 2 == 0)
				s += r;
			n /= 10;

		}
		return s;
	}

	public static int songuyento(int n) {
		if (n < 2)
			return 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return 0;
		}
		return 1;
	}

	public static int tongchusonguyento(int n) {
		int s = 0;
		while (n != 0) {
			int r = n % 10;
			if (songuyento(r) == 1)
				s += r;
			n /= 10;

		}
		return s;
	}

	public static int latnguocchuso(int n) {
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + n % 10;
			n /= 10;

		}
		return rev;
	}

	public static int uoc_cua_n_la_songuyento(int n) {
		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (songuyento(i) == 1 && n % i == 0) {
				cnt++;
				if (songuyento(n / i) == 1 && n / i != i) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static int uoc_nguyen_to_lon_nhat(int n) {
		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if ( n % i == 0) {
				if (songuyento(n / i) == 1 && n / i != i) {
					return cnt ;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(tongchuso(n));
	}
}
