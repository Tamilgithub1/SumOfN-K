import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int N=in.nextInt();
	int K=in.nextInt();
	int sum=0;
	for(int i=K;i>0;i--) {
		if(K<=N) {sum+=i;}
	}
	System.out.println(sum);
}
}
