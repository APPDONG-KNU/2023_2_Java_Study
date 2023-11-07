package fisrst;

import java.util.Scanner;

public class three {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y =sc.nextInt();
		sc.close();
        
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	
	}
}