using System; 

//Developed by: @LucasMarcuzo
class URI1994 {
    static void Main(string[] args) { 

        int n, C=0, R=0, S=0, x, coelhos=0, ratos=0, sapos=0, total;
        float tc, tr, ts;
        char y;

        n=int.Parse(Console.ReadLine());

        int[] vet = new int[n];

        for (int i = 0; i < n; i++)
        {
            string[] array = Console.ReadLine().Split(' ');

            x=int.Parse(array[0]);
            y=char.Parse(array[1]);

            if(y == 'C')
            {
                C++;
                coelhos+=x;

            }else if(y == 'R')
            {
                R++;
                ratos+=x;

            }else if(y == 'S')
            {
                S++;
                sapos+=x;
            }
        }

        total=coelhos+ratos+sapos;


        Console.WriteLine("Total: {0} cobaias", total);
        Console.WriteLine("Total de coelhos: {0}",coelhos);
        Console.WriteLine("Total de ratos: {0}",ratos);
        Console.WriteLine("Total de sapos: {0}",sapos);

        tc=(float)coelhos/total*100;
        tr=(float)ratos/total*100;
        ts=(float)sapos/total*100;

        Console.WriteLine("Percentual de coelhos: {0} %", tc.ToString("N2"));
        Console.WriteLine("Percentual de ratos: {0} %", tr.ToString("N2"));
        Console.WriteLine("Percentual de sapos: {0} %", ts.ToString("N2"));

    }

}