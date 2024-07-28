import java.util.*;
import static java.lang.System.*;
public class uva10071{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	//v*t=位移量
   	while(sc.hasNext()){
   		int v = sc.nextInt();
   		int t = sc.nextInt();
   		out.println(2*v*t);
   	}
    sc.close();
  }
};