import java.io.IOException;
import java.util.*;

//Developed by: @LucasMarcuzo
 
public class Main2164 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Double result = ((Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n)) / (Math.sqrt(5)));

        System.out.printf("%.1f\n",result);



    }
 
}