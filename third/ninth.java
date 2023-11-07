package third;
import java.util.Scanner;


public class ninth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int a;
		a = in.nextInt();
		in.close();
		for (int i=1;i<a+1;i++) {
			for (int n=1;n<i+1;n++) {
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
