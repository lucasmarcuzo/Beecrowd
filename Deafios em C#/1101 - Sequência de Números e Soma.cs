using System; 

//Developed by: @LucasMarcuzo
class URI1101 {

    static void Main(string[] args) { 

        int m, n, t=0;

         string[] array = Console.ReadLine().Split(' ');

            m=int.Parse(array[0]);
            n=int.Parse(array[1]);

        while (m > 0 && n > 0)
        {
            t=0;

            if(m <= 0 || n <= 0)
            {

            }else if(m > n)
            {
                for (int i = n; i <= m; i++)
                { 
                    t+=i;
                    Console.Write("{0} ",i);
                }

                Console.WriteLine("Sum={0}",t);

            }else if(n > m)
            {
                for (int i = m; i <= n; i++)
                { 
                    t+=i;
                    Console.Write("{0} ",i);
                }

                Console.WriteLine("Sum={0}",t);
            }

            string[] array1 = Console.ReadLine().Split(' ');

            m=int.Parse(array1[0]);
            n=int.Parse(array1[1]);
            
        }
        
    }
}

