import java.util.Scanner;  //2828. 사과 담기 게임

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), j = sc.nextInt();
		int left_num = 1, right_num = m, cnt = 0;
		
		for(int i = 0; i < j; i++) {
			int a = sc.nextInt();
			if(left_num <= a && right_num >= a)
				continue;
			else if(left_num > a) {
				cnt += left_num - a;
				right_num -= left_num - a;
				left_num = a;
			}
			else if(right_num < a) {
				cnt += a - right_num;
				left_num += a - right_num;
				right_num = a;
			}
		}
		
		System.out.print(cnt);
		sc.close();
	}
}
