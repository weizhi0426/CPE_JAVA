import java.util.Scanner;

public class uva10062{
	public static void main(String args[]){	
		Scanner sc=new Scanner(System.in);
		// 先創建127格陣列存放ASCII表對應位置儲存出現頻率
		// 找尋字符出現最大頻率
		// 找尋ASCII碼較高輸出
		int newline=0; 
		while(sc.hasNextLine()){
			if((newline++)!=0)System.out.println("");//若不是第一次輸入則加一行空行
			String st=sc.nextLine();
			
			int arr[]=new int[127];//ASCII表總共有127格
			int max=0;
			for(int i=0;i<st.length();i++) arr[st.charAt(i)]++;//將單字轉為ASCII碼存入相對應位置 
			for(int i=0;i<arr.length;i++) if(arr[i]>max) max=arr[i];//掃描字符出現最大頻率 
			
			//Output
			for(int i=1;i<=max;i++){//先從頻率1至max開始掃描
				for(int j=arr.length-1;j>=0;j--){//從ASCII表高位往低掃
					if(arr[j]==i)System.out.println(j+" "+arr[j]);//輸出
				}
			}
		}
	}
}