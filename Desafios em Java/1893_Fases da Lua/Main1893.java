import java.util.Scanner;

//Developed by: @LucasMarcuzo

public class Main1893 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();
        
        if(inicio >= 0 && fim <= 2 ) {
            System.out.println("nova");

        }else if(inicio >= 3 && fim <= 96 && inicio > fim){ 
            System.out.println("minguante");
        
        }else if(fim >= 97 && inicio <= 100){
            System.out.println("cheia");
        
        }else if (fim >= 3 && inicio <= 96){
            System.out.println("crescente");
        
        }

        leitor.close();
    }
}

