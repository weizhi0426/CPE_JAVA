import java.util.*;
public class uva10041{
  public static void main(String[] args) {
    //先將資料進行排序後找出中位數
    Scanner sc=new Scanner(System.in);
 	int cases = sc.nextInt();//有幾筆測資
 	while((--cases) >=0){
 		int size = sc.nextInt();//有幾位親戚
 		int[] arr = new int[size];//創建所需陣列數
 		for(int i = 0 ; i< size ; i++)
 			arr[i] = sc.nextInt();//先排入陣列 		
 		Arrays.sort(arr);//排序陣列 
        //找出與中位數的差，並加總		
 		int len = 0 ;
 		for(int i = 0 ; i<size ; i++){
 			len += Math.abs(arr[i] - arr[i/2]); 		
        }	
 		System.out.println(len);
 	}
    sc.close();
  }  
};