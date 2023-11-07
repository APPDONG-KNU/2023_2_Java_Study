package fourth;

import java.util.Scanner;

public class four {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N=9;
		int arr[]=new int[N];
		
		for (int i = 0;i<N;i++) {
			int a = in.nextInt();
			arr[i] = a;			
		}
		
		in.close();
		int max=0;
		int num=0;
		for (int i=0; i<N ;i++) {
			if(arr[i]>max) { 
				max=arr[i];
				num=i+1;
		}		
	}
		System.out.println(max);
		System.out.println(num);
  }
}
