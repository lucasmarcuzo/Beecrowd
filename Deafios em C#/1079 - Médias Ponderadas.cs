using System; 
using System.Globalization;

//Developed by: @LucasMarcuzo
class URI1079 {
    static void Main(string[] args) { 

        int n; 
        float x, y, z;

        n=int.Parse(Console.ReadLine());

        float[] vet = new float[n];

        for (int i = 0; i < n; i++)
        {
            string[] array = Console.ReadLine().Split(' ');

            x=float.Parse(array[0], CultureInfo.InvariantCulture);
            y=float.Parse(array[1], CultureInfo.InvariantCulture);
            z=float.Parse(array[2], CultureInfo.InvariantCulture);

            vet[i]=(x*2 + y*3 + z*5)/10;

        }


        foreach (float j in vet)
        {
            Console.WriteLine("{0:f1}",j);
        }

    }
}