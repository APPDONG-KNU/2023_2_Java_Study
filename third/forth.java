package third;

import java.util.Scanner;

public class forth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X=in.nextInt();
		int N = in.nextInt();
		int arr[]=new int[N];
		
		for (int i = 0;i<N;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a*b;			
		}
		in.close();
		
		int S=0;
		for (int i=0; i<N ;i++) {
			S=S+arr[i];
		}
		
		if (S==X)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
