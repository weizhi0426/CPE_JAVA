import java.util.*;

public class uva10038{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int cases = sc.nextInt();// 讀取數列的長度
			int[] arr = new int[cases];// 用來存放輸入的數列
			int[] arr2 = new int[cases];// 用來存放計算出的絕對差值
			int point = 0;
			for(int i =0; i< arr.length;i++)// 讀取數列
				arr[i] = sc.nextInt();
			boolean chk = false;// 用來判斷的變數
			for(int i=1;i<arr.length;i++){
				int num = Math.abs(arr[i]-arr[i-1]);
				if(num > arr.length-1|| num <1 ){// 絕對差值應在1到n-1之間
					chk = true;
					break;
				}else{
                    // 檢查是否有重複的絕對差值
					for(int j = 0;j<arr2.length;j++){
						if(arr2[j]==0)break;// 若當前位置為0，則未存入任何數值
						if(arr2[j]==num){// 若有重複數值，則不是“Jolly Jumper”
							chk = true;
							break;
						}
					}
					arr2[point] = num;// 存入絕對差值
					point++;
				}
					
			}
			
			if(!chk)System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}