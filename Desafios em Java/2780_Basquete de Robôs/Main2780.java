import java.util.*;

//Developed by: @LucasMarcuzo

class Main2780
{
     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        int jogada = scan.nextInt();

        if(jogada <= 800){
            System.out.println("1");
        }else if(jogada > 800 && jogada <= 1400){
            System.out.println("2");
        }else if(jogada > 1400 && jogada <= 2000){
            System.out.println("3");
        }

        
    }
}