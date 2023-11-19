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
			 double distance = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
			 if (x1==x2 && y1==y2 && r1==r2)
				 arr[i]=-1;
			 else if (distance>Math.pow(r1+r2,2))
				 arr[i]=0;
			 else if (distance<Math.pow(r2-r1,2))
				 arr[i]=0;
			 else if (distance==Math.pow(r2 - r1, 2))
				 arr[i]=1;			 
			 else if (distance==Math.pow(r1+r2, 2))
				 arr[i]=1;
			 else
				 arr[i]=2;
		 	}
		 for (int i=0;i<N;i++) {
			 System.out.println(arr[i]);
		 }
		 sc.close();
	}
}
