//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2444 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int volumeInicial = scan.nextInt();
        int numModificacoes = scan.nextInt();
        int totalVolume = volumeInicial;
        
        for(int i = 0; i < numModificacoes; i++){
            totalVolume += scan.nextInt();
            if(totalVolume < 0) totalVolume = 0;
            else if(totalVolume > 100) totalVolume = 100;
        }
          
        System.out.println(totalVolume);
        
        scan.close();
    
    }
}