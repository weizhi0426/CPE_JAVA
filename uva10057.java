import java.util.*;
import static java.lang.System.*;
public class uva10057{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // 找出中位數。
    // 計算有幾個和中位數一樣的數字。資料(cases)是偶數個時中位數有2個、資料是奇數個時中位數有1個。
    // 找出可能有幾種最小值(包含不在所輸入的資料裡面)，資料為奇數個時答案為1，資料為偶數個時答案為2個中位數相減加1。
    while((sc.hasNextInt())){
    	int[] cases = new int[sc.nextInt()];
    	for(int i=0; i < cases.length ; i++)
    		cases[i] = sc.nextInt();
    	
    	Arrays.sort(cases);    	
        //中位數
    	int mid = cases[(cases.length-1) / 2];
    	int mid2 = cases[cases.length / 2 ];
    	//有幾相同數字、同是中位數
    	int count = 0 ;
    	for(int i = 0 ; i < cases.length ; i++){
    		if(mid == cases[i] || mid2 == cases[i]) count++;
    	}
    	//有幾種最小可能
    	int min = mid2-mid+1;
    	out.println(mid+" " + count+" " + min );
    }
  }
};