//Developed by: @LucasMarcuzo

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	 
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int numero = scan.nextInt();
            if(numero % 2 == 0){
                numerosPares.add(numero);
            }else{
                numerosImpares.add(numero);
            }
        }

        Collections.sort(numerosImpares);
        Collections.sort(numerosPares);

        for (Integer i : numerosPares) {
             System.out.println(i);
        }
        
        for (int i = numerosImpares.size()-1; i >= 0; i--) {
                System.out.println(numerosImpares.get(i));
        }
    }
}