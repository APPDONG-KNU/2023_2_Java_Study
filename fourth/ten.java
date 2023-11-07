package fourth;

import java.util.Scanner;

public class ten {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = 0;
        
        for (int i = 0; i < N; i++) { 
        	if (arr[i]>M) M=arr[i];
        }
        
        float sum =0; 
        for (int i = 0; i < N; i++) {
        	sum=sum+(float)arr[i]/M*100/N;
        	
        }
        sc.close();
        System.out.print(sum);
    }
}
