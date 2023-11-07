package fourth;

import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int arr[]=new int[N];
		
		for (int i = 0;i<N;i++) {
			int a = in.nextInt();
			arr[i] = a;			
		}
		
		in.close();
		int max=0;
		int min=1000000;
		for (int i=0; i<N ;i++) {
			if(arr[i]>max) max=arr[i];
			if(arr[i]<min) min=arr[i];
	}
		System.out.print(min+" ");
		System.out.print(max);
		

  }
}
