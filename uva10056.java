import java.util.*;
import static java.lang.System.*;

public class uva10056 {
    public static void main(String[] args) {
        // 從輸入讀取測試用例數量。
        // 對每個測試用例，讀取 n（參賽者數量）、p（每局比賽獲勝概率）和 m（目標參賽者編號）。
        // 計算並輸出目標參賽者獲勝的概率。
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while ((--cases) >= 0) {
            int n = sc.nextInt();
            double p = sc.nextDouble();
            int m = sc.nextInt();

            double q = 1 - p;//每局比賽失敗的概率 1 - p。
            if (p == 0)
                out.printf("%.4f", p);
            else {
                double a = p * Math.pow(q, m - 1);//a 是第 m 個人獲勝的概率，即 p 乘以 q 的 m-1 次方。
                double r = 1 - Math.pow(q, n);//r 是至少有一個人獲勝的概率，即 1 - q 的 n 次方。
                out.printf("%.4f", a / r);//輸出結果為 a / r，格式為四位小數。
            }
            out.println();
        }
        sc.close();
    }

}