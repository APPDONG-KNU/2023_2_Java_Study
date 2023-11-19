package baekjun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
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
