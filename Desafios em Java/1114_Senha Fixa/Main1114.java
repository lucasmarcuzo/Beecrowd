//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1114 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String senha="2002";  
        String senhauser; 

        do{                    
            senhauser=scan.nextLine();

            if(!senha.equals(senhauser)){

                System.out.println("Senha Invalida"); 
            }

        }while(!senha.equals(senhauser));               

        System.out.println("Acesso Permitido"); 


        scan.close();
    
    }
}