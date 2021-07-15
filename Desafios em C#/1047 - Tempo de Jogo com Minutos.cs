using System; 

//Developed by: @LucasMarcuzo
class URI1047 {

    static void Main(string[] args) { 
 
        int h1, m1, s1, h2, m2, s2, tempo, hr, min;

        string[] s = Console.ReadLine().Split(' ');

        h1=int.Parse(s[0]);
        m1=int.Parse(s[1]);
        h2=int.Parse(s[2]);
        m2=int.Parse(s[3]);

        if (h2 <= h1 && m2 <= m1) 
        {
            h2 = h2 + 24;

        }else if (m2 <= m1) 
        { 
            m2 = m2 + 60;
            h2 = h2 - 1;
        }

        s1 = (h1 * 3600) + (m1 * 60);
        s2 = (h2 * 3600) + (m2 * 60);

        tempo = (s2 - s1);
        hr = tempo / 3600;
        min = (tempo - (hr * 3600)) / 60;

        Console.WriteLine("O JOGO DUROU {0} HORA(S) E {1} MINUTO(S)", hr, min);
    }
}