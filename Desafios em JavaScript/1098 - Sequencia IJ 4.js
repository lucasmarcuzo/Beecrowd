var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var vet = new Array(30);
var vet2 = new Array(30);

var x=0, y=0;
var j=3;

for (let i = 3; i < 30; i++)
{

    if(x === 0.0)
    {
        console.log(`I=${Math.round(vet2[0]=0)} J=${Math.round(vet[0]=1)}`);
        console.log(`I=${Math.round(vet2[1]=0)} J=${Math.round(vet[1]=2)}`);
        console.log(`I=${Math.round(vet2[2]=0)} J=${Math.round(vet[2]=3)}`);
    }
     
    x+=0.2;
    y=vet[0]+x;
        console.log(`I=${vet2[i]=x.toFixed(1)} J=${vet[j]=y.toFixed(1)}`);
    j++;
    i++;
    y=vet[1]+x;
        console.log(`I=${vet2[i]=x.toFixed(1)} J=${vet[j]=y.toFixed(1)}`);
    j++;
    i++;
    y=vet[2]+x;
        console.log(`I=${vet2[i]=x.toFixed(1)} J=${vet[j]=y.toFixed(1)}`);


    if(x == 0.8 || y == 4.8){

      x+=0.2;
      y=vet[0]+x;
        console.log(`I=${Math.round(vet2[i]=x)} J=${Math.round(vet[j]=y)}`);
      j++;
      i++;
      y=vet[1]+x;
        console.log(`I=${Math.round(vet2[i]=x)} J=${Math.round(vet[j]=y)}`);
      j++;
      i++;
      y=vet[2]+x;
        console.log(`I=${Math.round(vet2[1]=x)} J=${Math.round(vet[j]=y)}`);

    }

}