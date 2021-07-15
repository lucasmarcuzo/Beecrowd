using System; 

//Developed by: @LucasMarcuzo

class URI{

    static void Main(string[] args) { 

        int d1, h1, m1, s1, d2, h2, m2, s2; 
        string dia;
        char x;

        string[] l1 = Console.ReadLine().Split(' ');

        dia=Convert.ToString(l1[0]);
        d1=int.Parse(l1[1]);

        string[] s = Console.ReadLine().Split(' ');
        
        h1=int.Parse(s[0]);
        x=char.Parse(s[1]);
        m1=int.Parse(s[2]);
        x=char.Parse(s[3]);
        s1=int.Parse(s[4]);

        string[] l2 = Console.ReadLine().Split(' ');

        dia=Convert.ToString(l2[0]);
        d2=int.Parse(l2[1]);

        string[] t = Console.ReadLine().Split(' ');

        h2=int.Parse(t[0]);
        x=char.Parse(t[1]);
        m2=int.Parse(t[2]);
        x=char.Parse(t[3]);
        s2=int.Parse(t[4]);

        s1 = s2 - s1;
        m1 = m2 - m1;
        h1 = h2 - h1;
        d1 = d2 - d1;

        if (s1 < 0 ) {
	        s1 += 60 ;
	        m1--;
        }

        if (m1 < 0 ) {
	        m1 += 60 ;
	        h1--;
        }

        if (h1 < 0 ) {
	        h1 += 24 ;
	        d1--;
        }

        Console.WriteLine("{0} dia(s)", d1);
        Console.WriteLine("{0} hora(s)", h1);
        Console.WriteLine("{0} minuto(s)", m1);
        Console.WriteLine("{0} segundo(s)", s1);

    }

}