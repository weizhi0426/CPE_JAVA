import java.util.*;
import static java.lang.System.*;
public class uva10035{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    	int n = sc.nextInt();//讀取第一個數字
    	int m = sc.nextInt();//讀取第二個數字
    	int times = 0 ; //用來記錄進位次數
    	int carry = 0 ;//用來記錄當前的進位值
    	if(n == 0 && m == 0 ) break ;//若輸入2個0為結束 
    	while( n != 0 || m != 0 ){//若不是兩輸入為0則進行以下操作
    		if(n % 10 + m % 10 + carry >= 10 ){
    			times ++ ;//進位次數+1
    			carry = 1 ; //設置進位值為1
    		}else carry = 0  ;// 否則進位值為0
    		n /= 10 ;//移除 n 的最後一位數字
    		m /= 10 ;//移除 m 的最後一位數字			
    	}
    	switch (times){
    		case 0 : 
    			out.println("No carry operation.");//無進位
    			break ; 
    		case 1 :
    			out.println(times + " carry operation.");//若只有進位1次
    			break ;
    		default :
    			out.println(times + " carry operations.");//進位次數大於1
    			break;
    	}
    	
    }
  }
};