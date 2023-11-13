import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        
        int n1 = N.length()/10;            
        int start_index = 0;
        int end_index = start_index+10;
        
        for(int i=0; i<n1; i++){
            System.out.println(N.substring(start_index, end_index));
            start_index+=10;
            end_index+=10;    
        }
        
        int n2 = N.length()%10;
        System.out.println(N.substring(N.length()-n2));
    }
}
