import java.util.*;
import static java.lang.System.*;
public class uva10055{
  public static void main(String[] args) {
    //由於輸入有提到士兵數不會超過2的63次方故使用long
    Scanner sc=new Scanner(System.in);
  	while(sc.hasNextLong()){
  		long n = sc.nextLong();
  		long m = sc.nextLong();
  		out.println(Math.abs(n-m));
  	}
  }
};