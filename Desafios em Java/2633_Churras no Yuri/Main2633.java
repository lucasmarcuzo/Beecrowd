import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

//Developed by: @LucasMarcuzo

public class Main2633 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        TreeMap<Integer, String> carnes = new TreeMap<>();

        while (scan.hasNext()) {   

            int numPecasCarne = scan.nextInt();

            for (int i = 0; i < numPecasCarne; i++) {
                var nomeCarne = scan.next();
                var dataValidade = scan.nextInt();
        
                carnes.put(dataValidade, nomeCarne);
            }

            System.out.println(String.join(" ", carnes.values()));
            carnes.clear();
        }

        scan.close();
        
    }
    
}
