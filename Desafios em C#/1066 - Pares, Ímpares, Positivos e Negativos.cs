using System; 

//Developed by: @LucasMarcuzo
class URI1066 {
    static void Main(string[] args) { 

        int w, x, y, z;
        w=x=y=z=0;

        int[] vetor=new int[5];

        for(int i=0; i<vetor.Length; i++)
        {
           vetor[i]=int.Parse(Console.ReadLine());
        }

        for(int i=0; i<vetor.Length; i++)
        {
            if(vetor[i]>0){
                w++;
            }if(vetor[i]<0){
                x++;
            }if(vetor[i] % 2 == 0){
                y++;
            }if(vetor[i] % 2 != 0){
                z++;
            }
        }

        Console.WriteLine("{0} valor(es) par(es)",y);
        Console.WriteLine("{0} valor(es) impar(es)",z);
        Console.WriteLine("{0} valor(es) positivo(s)",w);
        Console.WriteLine("{0} valor(es) negativo(s)",x);

    }

}