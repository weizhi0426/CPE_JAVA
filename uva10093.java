import java.util.*;

class uva10093 {
    public static void main(String args[]) {
        //以10進位為例，每個位數相加如果是9的倍數，那麼就可以被9整除。
        Scanner sc = new Scanner(System.in);
        String st;
        // 當還有下一行輸入時進行處理
        while (sc.hasNextLine()) {
            st = sc.nextLine(); // 讀取一行輸入
            
            char Ctemp[] = st.toCharArray(); // 將這行輸入轉換成字符陣列
            int sum = 0;
            int max = 1;

            // 遍歷每個字符
            for (char temp : Ctemp) {
                int R = 0;
                if (temp >= 48 && temp <= 57) // 如果字符是數字
                    R = temp - 48; // 將字符轉換成對應的數字 ('0' 對應 48)
                else if (temp >= 65 && temp <= 90) // 如果字符是大寫字母
                    R = temp - 55; // 將字符轉換成對應的數字 ('A' 對應 65, 所以減 55 得 10)
                else if (temp >= 97 && temp <= 122) // 如果字符是小寫字母
                    R = temp - 61; // 將字符轉換成對應的數字 ('a' 對應 97, 所以減 61 得 36)
                
                sum = sum + R; // 累計所有字符的數字值
                if (R > max) max = R; // 找出最大值
            }

            // 從最大值開始檢查每個基數，直到 62
            for (int i = max; i <= 62; i++) {
                if (i == 62) { // 如果檢查到基數 62
                    System.out.println("such number is impossible!"); // 找不到符合條件的基數
                    break;
                }
                if (sum % i == 0) { // 如果總和能被 i 整除
                    System.out.println(i + 1); // 打印基數 i + 1 (因為基數從 2 開始)
                    break;
                }
            }
        }
    }
}