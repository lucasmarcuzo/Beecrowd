//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1828 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int qtdTeste = scan.nextInt();
        
        String v1, v2;
        
        for (int i = 1; i <=qtdTeste; i++)
        {
            v1 = scan.next();
            v2 = scan.next();

            if((v1.equals("tesoura")) && v2.equals("papel")||(v1.equals("papel")) && v2.equals("pedra") 
                || (v1.equals("pedra")) && v2.equals("lagarto") || (v1.equals("lagarto")) && v2.equals("Spock")
                || (v1.equals("Spock")) && v2.equals("tesoura") || (v1.equals("tesoura")) && v2.equals("lagarto")
                || (v1.equals("lagarto")) && v2.equals("papel") || (v1.equals("papel")) && v2.equals("Spock")
                || (v1.equals("Spock")) && v2.equals("pedra") || (v1.equals("pedra")) && v2.equals("tesoura")){

                System.out.printf("Caso #%d: Bazinga!\n", i);          
                    
            }else if(v1.equals(v2)){
                
                System.out.printf("Caso #%d: De novo!\n", i);
                    
            }else{
                
                System.out.printf("Caso #%d: Raj trapaceou!\n", i);
            }     
        }



        scan.close();
    
    }
}