import java.io.IOException;
import java.util.Scanner;

//Developed by: @LucasMarcuzo

public class Main1963 {
	
    public static void main(String[] args) throws IOException {
        
    	Scanner leitor = new Scanner(System.in);
    	
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
      
        double valorIngresso = (((B - A) / A) * 100);
      
        System.out.printf("%.2f%%\n", valorIngresso);
      
    }
	
}