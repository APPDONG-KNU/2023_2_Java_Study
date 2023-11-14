package baekjun;
import java.util.Scanner;
public class prob30621 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 입력
	        int N = sc.nextInt();
	        int[] t = new int[N];
	        int[] b = new int[N];
	        int[] c = new int[N];

	        for (int i = 0; i < N; i++) {
	            t[i] = sc.nextInt();
	        }

	        for (int i = 0; i < N; i++) {
	            b[i] = sc.nextInt();
	        }

	        for (int i = 0; i < N; i++) {
	            c[i] = sc.nextInt();
	        }

	        long[] dp = new long[N];
	        dp[0] = c[0];

	        for (int i = 1; i < N; i++) {	           
	            int maxConfusion = 0;
	            for (int j = i - 1; j >= 0; j--) {
	                if (t[i] - b[i] > t[j]) {
	                    maxConfusion = Math.max(maxConfusion, (int) dp[j]);
	                }
	            }	         
	            dp[i] = Math.max(dp[i - 1], maxConfusion + c[i]);
	        }
	        System.out.println(dp[N - 1]);
	        sc.close();
	    }
}
