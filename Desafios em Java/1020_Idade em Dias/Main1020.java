//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1020 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int notes, aux;

        notes=scan.nextInt();

        System.out.printf("%d ano(s)\n", notes/365);
        aux = (notes%365);

        System.out.printf("%d mes(es)\n", aux/30);
        aux = (aux%30);

        System.out.printf("%d dia(s)\n", aux/1);
        
        scan.close();

    } 
}