package baekjun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
//피자가 테이블에 맞는지 여부만 저장하면 되므로,boolean type의 배열을 사용
//문제에서 1000개의 테이블을 비교하기를 요구하였기 때문에 배열의 크기를 1000으로 지정하였으나,실행시간의 단축을 위해 count변수를 지정해서 이용함.
		 boolean[] table = new boolean[1000];
		 int count=0;
		 for (int i=0;i<1000;i++) {
			 int r = sc.nextInt();
			 if (r==0)
				 break;
			 else {	
				 count++;
				 int w = sc.nextInt();
				 int l = sc.nextInt();
//원에 내접하는 직사각형은 대각선의 길이가 원의 지름과 같음을 이용
				 if (Math.pow(w,2)+Math.pow(l,2)<=Math.pow(2*r, 2))
					 table[i]=true;
				 else
					 table[i]=false;		
		 	}
		}
		 for (int i=0;i<count;i++) {
			 if (table[i]==true)
				 System.out.println("Pizza "+(i+1)+" fits on the table.");
			 else
				 System.out.println("Pizza "+(i+1)+" does not fit on the table.");
			 
		 }
		 sc.close();
	}
}
