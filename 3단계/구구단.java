import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(s);  
                   
        for(int i=1; i<10; i++){
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
}
