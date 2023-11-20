//1018. 체스판 다시 칠하기
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = 64;
		
		String[] board = new String[n];
		boolean[][] board1 = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			board[i] = sc.next();
			
			for(int j = 0; j < m; j++) {
				if((i+j) % 2 == 0 && board[i].charAt(j) == 'W')
					board1[i][j] = true;
				else if((i+j) % 2 != 0 && board[i].charAt(j) == 'B')
					board1[i][j] = true;
			}
		}
		
		
		
		for(int i = 0; i <= n - 8; i++)
			for(int j = 0; j <= m - 8; j++) {
				int cnt = 0;
				
				for(int k = 0; k < 8; k++)
					for(int l = 0; l < 8; l++) {
						if(board1[i+k][j+l] == true)
							cnt++;
					}
				
				cnt = Math.min(64-cnt, cnt);
				min = Math.min(min, cnt);
			}
		
		System.out.print(min);
		sc.close();
	}
}
