//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1019 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int tempo;

        tempo=scan.nextInt();

        int hora= tempo / 3600;
        tempo= tempo - (hora * 3600);

        int min= tempo / 60;
        tempo= tempo - (min * 60);

        System.out.printf("%d:%d:%d\n",hora,min,tempo);

        scan.close();

    } 
}