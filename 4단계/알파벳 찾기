import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s = sc.next();
		
		int[] ary = new int[26];
		for(int i = 0; i < 26; i++) {
			ary[i] = -1;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(ary[s.charAt(i)-'a'] == -1) {
				ary[s.charAt(i)-'a'] = s.indexOf(s.charAt(i));
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(ary[i] + " ");
		}	
		
	}
}
