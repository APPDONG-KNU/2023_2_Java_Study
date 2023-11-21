package baekjun;
//1002번
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 int arr[]=new int [N];
		 for (int i=0;i<N;i++) {
			 int x1=sc.nextInt();
			 int y1=sc.nextInt();
			 int r1=sc.nextInt();
			 int x2=sc.nextInt();
			 int y2=sc.nextInt();
			 int r2=sc.nextInt();
//두 점사이의 거리와 두 점을 중심으로 하는 두 원의 반지름을 비교하여 두 원의 만나는 점을 파악
			 double distance = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
//두 원이 일치할 때
			 if (x1==x2 && y1==y2 && r1==r2)
				 arr[i]=-1;
//두 원이 만나지 않을 때
			 else if (distance>Math.pow(r1+r2,2))
				 arr[i]=0;
//한 원이 다른 원의 내부에 있고, 만나지 않을 때
			 else if (distance<Math.pow(r2-r1,2))
				 arr[i]=0;
//두 원이 내접할 때
			 else if (distance==Math.pow(r2 - r1, 2))
				 arr[i]=1;
//두 원이 외접할 때			 
			 else if (distance==Math.pow(r1+r2, 2))
				 arr[i]=1;
//두 원이 두점에서 만날 때
			 else
				 arr[i]=2;
		 	}
		 for (int i=0;i<N;i++) {
			 System.out.println(arr[i]);
		 }
		 sc.close();
	}
}
