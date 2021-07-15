using System; 

//Developed by: @LucasMarcuzo
class URI1098 {

    static void Main(string[] args) { 

      float[] vet = new float[30];

      float[] vet2 = new float[30];

      float x=0, y=0;

      int j=3;
     
      for (int i = 3; i < 30; i++)
      {

          if(x == 0.0f)
          {

            Console.WriteLine("I={0} J={1}", vet2[0]=0, vet[0]=1);
            Console.WriteLine("I={0} J={1}", vet2[1]=0, vet[1]=2);
            Console.WriteLine("I={0} J={1}", vet2[2]=0, vet[2]=3);
          }
           
          x+=0.2f;
          y=vet[0]+x;
          Console.WriteLine("I={0:f1} J={1:f1}", vet2[i]=x, vet[j]=y);
          j++;
          i++;
          y=vet[1]+x;
          Console.WriteLine("I={0:f1} J={1:f1}", vet2[i]=x, vet[j]=y);
          j++;
          i++;
          y=vet[2]+x;
          Console.WriteLine("I={0:f1} J={1:f1}", vet2[i]=x, vet[j]=y);


          if(x == 0.8f || y == 4.8f){

            x+=0.2f;
            y=vet[0]+x;
            Console.WriteLine("I={0} J={1}", vet2[i]=x, vet[j]=y);
            j++;
            i++;
            y=vet[1]+x;
            Console.WriteLine("I={0} J={1}", vet2[i]=x, vet[j]=y);
            j++;
            i++;
            y=vet[2]+x;
            Console.WriteLine("I={0} J={1}", vet2[1]=x, vet[j]=y);

          }
      }
    }
}