//Developed by: @LucasMarcuzo

import java.util.Scanner;

public class Main1047 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int h1, m1, s1, h2, m2, s2, tempo, hr, min;

        h1=scan.nextInt();
        m1=scan.nextInt();
        h2=scan.nextInt();
        m2=scan.nextInt();

        if (h2 <= h1 && m2 <= m1) {

            h2 = h2 + 24;

        }else if (m2 <= m1) {

            m2 = m2 + 60;
            h2 = h2 - 1;
        }

        s1 = (h1 * 3600) + (m1 * 60);
        s2 = (h2 * 3600) + (m2 * 60);

        tempo = (s2 - s1);
        hr = tempo / 3600;
        min = (tempo - (hr * 3600)) / 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hr, min);

        scan.close();
    }        
}
