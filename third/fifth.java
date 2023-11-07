package third;

import java.util.Scanner;

public class fifth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		in.close();
		a=a/4;
		
		for(int i = 0; i<a;i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
