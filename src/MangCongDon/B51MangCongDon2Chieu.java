package MangCongDon;

import java.util.Scanner;

public class B51MangCongDon2Chieu {

    public static Scanner sc = new Scanner(System.in);
    public static long[][] pre = new long[1005][1005];

    public static void mang_cong_don_2_chieu(int n, int m, int[][] a) {
        // Khởi tạo mảng pre về 0
        for (int i = 0; i < 1005; i++) {
            for (int j = 0; j < 1005; j++) {
                pre[i][j] = 0;
            }
        }

        // Tính mảng cộng dồn 2 chiều (prefix sum)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pre[i][j] = pre[i - 1][j] + pre[i][j - 1]
                          - pre[i - 1][j - 1] + a[i][j];
            }
        }

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[1005][1005];

        // Nhập mảng a (chuyển 1 -> 1, còn lại -> 0)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = (sc.nextInt() == 1) ? 1 : 0;
            }
        }

        // Tính mảng cộng dồn
        mang_cong_don_2_chieu(n, m, a);

        // Giải quyết 3 truy vấn vùng (rectangle sum)
        int t = 3;
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();

            long result = pre[x2][y2] - pre[x1 - 1][y2] - pre[x2][y1 - 1] + pre[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
