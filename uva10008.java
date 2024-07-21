import java.util.*;

public class uva10008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();//將有幾列需要分析
        sc.nextLine();
        int[] count = new int[26];//建置一26陣列儲存26字母出現次數
        int max = 0;//紀錄字母出現ㄉ最高次數
        while ((lines--) > 0) {//做幾次
            String st = sc.nextLine().toUpperCase();//將輸入ㄉ英文字串轉為大寫
            for (int i = 0; i < st.length(); i++) {//審視輸入字串
                char cr = st.charAt(i);//將英文字母變為ASCII碼數字
                if (cr >= 65 && cr <= 90) {//ASCII大寫A~Z 65~90 檢查是否為大寫字母

                    count[cr - 65]++;// 增加相應字母在count陣列中的計數
                    max = Math.max(max, count[cr - 65]);//更新最大出現次數 儲存max與count較大值
                }
            }
        }

        while (max > 0) {//從最大出現次數開始高到低輸出字母和次數
            for (int i = 0; i < count.length; i++) {
                if (count[i] == max) {//看是否對應到目前最大值
                    int tmp = i + 65;//轉換成ASCII碼大寫相應
                    System.out.println((char) tmp + " " + count[i]);//(char) tmp為轉換成大寫字母
                }
            }
            max--;//將最大值慢慢往下降
        }
    }

}