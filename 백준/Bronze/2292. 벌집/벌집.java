import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) - 1;
        
        int i = 1;
        int sum = 0;

        while(sum < num) { 
            sum = sum + (6 * i);
            i++;
        }
        
        System.out.println(i);
        
    }
}