package fourth;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int arr[]=new int[N];
		
		for (int i = 0;i<N;i++) {
			int a = in.nextInt();
			arr[i] = a;			
		}
		
		int v=in.nextInt();
		in.close();
		
		int s = 0;
		for (int i=0; i<N ;i++) {
			if(arr[i]==v) s++;		
	}
			System.out.println(s);
		
  }
}
