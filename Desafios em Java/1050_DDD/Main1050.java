import java.util.Scanner;

public class Main1050 {

    public static void main(String[] args){
        
        Scanner scan= new Scanner(System.in);

        int DDD=0;

        DDD=scan.nextInt();

        if(DDD == 61){

	 	    System.out.println("Brasilia");
	 
        }else if (DDD == 71){

            System.out.println("Salvador");

	    }else if (DDD == 11){
	 	
            System.out.println("Sao Paulo");

	    }else if (DDD == 21){

            System.out.println("Rio de Janeiro");
	 
        }else if (DDD == 32){
	 	
            System.out.println("Juiz de Fora");

	    }else if (DDD == 19){
	 	
            System.out.println("Campinas");

	    }else if (DDD == 27){
	 	
            System.out.println("Vitoria");
	 
        }else if (DDD == 31){

            System.out.println("Belo Horizonte");

		}else{

		    System.out.println("DDD nao cadastrado");
		}

        scan.close();

    }
    
}
