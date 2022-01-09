using System;

//Developed by: @LucasMarcuzo

namespace _2754___Saída_8
{
    class Program
    {
        static void Main(string[] args)
        {
            double x = 234.345;
            double y = 45.698;

            string xxe =  x.ToString("e").Substring(0, 11);
            string yye =  y.ToString("e").Substring(0, 11);
            string xxE =  x.ToString("E").Substring(0, 11);
            string yyE =  y.ToString("E").Substring(0, 11);

            Console.Write("{0:F6} - {1:F6}\n", x, y);
            Console.Write("{0} - {1}\n", Math.Round(x), Math.Round(y));
            Console.Write("{0:F1} - {1:F1}\n", x, y);
            Console.Write("{0:F2} - {1:F2}\n", Math.Round(x, 2), Math.Round(y, 2));
            Console.Write("{0:F3} - {1:F3}\n", x, y);
            Console.Write("{0:e} - {1:e}\n", String.Format(xxe + 2), String.Format(yye + 1));
            Console.Write("{0:E} - {1:E}\n", String.Format(xxE + 2), String.Format(yyE + 1));
            Console.Write("{0:e} - {1:e}\n", x.ToString().Substring(0, 7), y.ToString().Substring(0, 6));
            Console.Write("{0:E} - {1:E}\n", x.ToString().Substring(0, 7), y.ToString().Substring(0, 6));
            



        }
    }
}
