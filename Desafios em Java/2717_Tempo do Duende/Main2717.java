import java.util.Scanner;

public class Main2717 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
    
        int finalExpediente = scan.nextInt();
        
        int presente1 = scan.nextInt();
        int presente2 = scan.nextInt();
        
        int total =  presente1 + presente2;
        
        if (total > finalExpediente){
            System.out.println("Deixa para amanha!");
        }else{
            System.out.println("Farei hoje!");
        }

        scan.close();
    }
    
    
}
