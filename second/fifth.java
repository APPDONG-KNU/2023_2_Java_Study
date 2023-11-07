package second;

import java.util.Scanner;

public class fifth {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			sc.close();
	        B=B-45;
			
			if(B<0) {
				B=B+60;
				A=A-1;
			}
			if (A<0) {
				A=A+24;
			}
			System.out.println(A+" "+B);
		}
}
