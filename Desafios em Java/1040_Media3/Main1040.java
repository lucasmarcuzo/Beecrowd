//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1040 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        float n1, n2, n3, n4, media, exame;

        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        n4 = scan.nextFloat();

        media = ((n1*2 + n2*3 + n3*4 + n4*1) / (2 + 3 + 4 + 1));

        if (media >= 7.0){

            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");

        }
        else{

            if (media < 5.0){

                System.out.printf("Media: %.1f\n", media-0.01);
                System.out.println("Aluno reprovado.");

            }
            else{

                System.out.printf("Media: %.1f\n", media-0.01);
                System.out.println("Aluno em exame.");
                exame = scan.nextFloat();
                System.out.printf("Nota do exame: %.1f\n", exame);
                media = (media + exame)/2;
                if (media >= 5.0){
                    System.out.println("Aluno aprovado.");
                }
                else{
                    System.out.println("Aluno reprovado.");
                }

                System.out.printf("Media final: %.1f\n", media);
            }
        }

        scan.close();
    }        
}
