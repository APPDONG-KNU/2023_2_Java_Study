import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        int a = Integer.parseInt(br.readLine());
        
        if(90<=a){
            System.out.println("A");
        } else if(80<=a){
            System.out.println("B");
        } else if(70<=a){
            System.out.println("C");
        } else if(60<=a){
            System.out.println("D");
        } else
            System.out.println("F");
    }
}
