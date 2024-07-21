import java.util.*;
import static java.lang.System.*;
public class uva10050{
  public static void main(String[] args) {
    //1. 使用陣列紀錄哪些天是罷工。
    //2. 以7取餘數，餘6、餘0(星期五、星期六)則不需要計算罷工天數。
    Scanner sc=new Scanner(System.in);
    int cases = sc.nextInt();
    while((--cases) >= 0 ){
    	boolean[] week = new boolean[sc.nextInt()];//幾天    	
    	int people = sc.nextInt();//多少政黨
    	int num = 0 ;
    	for(int i = 0;i < people ; i++){    		    		
    		int party = sc.nextInt();//罷工日
            //紀錄是否罷工    		
    		for(int j = party ; j <= week.length ; j+= party){
    			if(j % 7 != 0 && j %7 != 6 ){//餘0為禮拜六 餘6為禮拜五
    				week[j-1] = true;
    				
    			}
    		}    		
    	}
    	
    	for(int i = 0 ; i < week.length ; i++)
    		if(week[i]) num++;//計算罷工幾天
    	out.println(num);
    	
    }
  }
};