using System;

//Developed by: @LucasMarcuzo

class URI1176 {

    static void Main(){

        long n1=0, n2=1, n3=0;
        string valor;

        int x=int.Parse(Console.ReadLine());

        long[] vet = new long[61];

        int[] vety = new int[x];

        for (int i = 0; i < x; i++)
        {
            vety[i]=int.Parse(Console.ReadLine());
        }
         
        for (int j = 1; j < 61; j++)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            vet[j]=(long)n3;
        }

        for (int k = 0; k < x; k++)
        {
            valor=Convert.ToString(vet.GetValue(vety[k]));
            Console.WriteLine("Fib({0}) = {1}", vety[k], valor);
        }
    }
}