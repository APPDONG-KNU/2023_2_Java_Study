package third;

import java.util.Scanner;

public class third {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int c = in.nextInt();
		int s = 0;
		in.close();
		
		for (int i = 1;i<c+1;i++) {
			s=s+i;	
		}
		
		System.out.println(s);
		
	}
}
