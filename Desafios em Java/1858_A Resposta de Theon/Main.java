//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
		  Scanner leitor = new Scanner(System.in);
		  
		  int N = leitor.nextInt();
		  int T, menor = 21, posMenor = 0;
		  
    	for (int i = 1; i <= N; i++) {
  		  T = leitor.nextInt();
  		  if (menor > T) 
  		  {
  			    menor = T;
            posMenor = i;
  		  } 
	    }
  		  System.out.println(posMenor);
  }
}