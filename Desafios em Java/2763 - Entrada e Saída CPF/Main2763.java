//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main2763 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String cpf = scan.next().replace(".", "").replace("-", "");  

        String[] cpf_completo = new String[4];

        cpf_completo[0]=cpf.substring(0,3); 
        cpf_completo[1]=cpf.substring(3,6); 
        cpf_completo[2]=cpf.substring(6,9); 
        cpf_completo[3]=cpf.substring(9,11); 

        for (String i : cpf_completo)
        {
            System.out.printf("%s\n", i);
        }   


        scan.close();
    
    }
}