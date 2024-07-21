import java.util.*;
import static java.lang.System.*;

public class uva10019{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   	int cases = sc.nextInt();//有幾筆
   	while((--cases) >= 0 ){
   		int num = sc.nextInt();
   		String decimal = Integer.toString(num , 2 );//將輸入取二進制並將其化為字串
   		int a = 0 ;
   		
   		for(int i =0;i<decimal.length(); i++)//將此字串一一檢查
   			if(decimal.charAt(i) == '1')a++;//找尋有幾個1
   		String hax = Integer.toString(num , 16);//將輸入轉為16進制並將其化為字串
   		int b = HAX(num+"");//接收return
   		out.println(a + " " + b );
   	}
  }
  
  public static int HAX(String str){
  
  	int num = 0 ;
  	for(int i = 0 ; i< str.length();i++){
  		String c = (str.charAt(i)+"").toUpperCase();//將英文變大寫 ex:'e' + "" 會得到字符串 "e" 差別在字符與字串
  		char cha = c.charAt(0);//將轉換後字串提取
  		int idx = 0 ;
  		if(cha >= 'A' && cha <= 'Z'){
			//將轉換後ASCII碼轉化為16進制對應數字
			//如果cha是'B'，則cha-'A'等于66-65，结果是1。  	
  			idx = cha - 'A' + 10;
				
  		}else idx = cha - '0';//將字串為相對應數字
  	
		String binary = Integer.toString(idx , 2);//轉為二進制字串
		for(int j = 0 ; j < binary.length() ; j++){
			if(binary.charAt(j) == '1')num++;//計算字串中有多少1
		}
  	
  	}
  	return num;//return有多少1回去
  }
};