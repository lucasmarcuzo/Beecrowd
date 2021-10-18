//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2029 {
	
    public static void main(String[] args) throws IOException {
      
    	Scanner scan = new Scanner(System.in);
    	
    	DecimalFormat df = new DecimalFormat("0.00");
    	
    	double V, D, R, area, altura;
    	
    	while (scan.hasNext()) {
    	  
    		V = scan.nextDouble();
    		D = scan.nextDouble();
    		R = D / 2;
    		area = ((3.14 * R) * R);
    		altura = V / area;
    		
    		System.out.println("ALTURA = " + df.format(altura));
    		System.out.println("AREA = " + df.format(area));
    	}

        scan.close();
    }
	
}