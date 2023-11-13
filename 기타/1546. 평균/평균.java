import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = 0;
        double sum_of_points = 0.0;
        
        for(int i=0; i<N; i++){
            int point = Integer.parseInt(st.nextToken());
            
            if(point>=max){
                max = point;
            }
            sum_of_points+=point;
        }
        double new_average = (((sum_of_points/max)*100.0)/N);
        System.out.println(new_average);
    }
}
