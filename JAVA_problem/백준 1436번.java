//1436. 영화감독 숌
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 1;
		int num = 666;
		
		while(n != cnt) {
			num++;
			if(Integer.toString(num).contains("666"))
				cnt++;
		}
		
		System.out.print(num);
		sc.close();
	}
}
