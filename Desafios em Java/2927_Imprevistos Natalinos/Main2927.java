import java.io.IOException;
import java.util.Scanner;
 
public class Main2927  {
 
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner(System.in);
        
        int numAlunos = leitor.nextInt();
        int numPc = leitor.nextInt();
        int qtsPcsQuebrados = leitor.nextInt();
        int qtsPcsSemComp = leitor.nextInt();
        
        
        if (numPc - (numAlunos + qtsPcsQuebrados + qtsPcsSemComp + 1) >= 0){
          System.out.println("Igor feliz!");
        } 
        else {
          if ((qtsPcsSemComp / 2) < qtsPcsQuebrados) System.out.println("Caio, a culpa eh sua!");
          else System.out.println("Igor bolado!");
        }

        leitor.close();
    }
   
}