var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var w=0, x=0, y=0, z=0;
var vetor = new Array(5);

for(let i=0; i<vetor.length; i++)
{
    vetor[i]=parseInt(lines.shift());
}

for(let i=0; i<vetor.length; i++)
{
    if(vetor[i]>0){
        w++;
    }if(vetor[i]<0){
        x++;
    }if(vetor[i] % 2 === 0){
        y++;
    }if(vetor[i] % 2 !== 0){
        z++;
    }
}

console.log(`${y} valor(es) par(es)`);
console.log(`${z} valor(es) impar(es)`);
console.log(`${w} valor(es) positivo(s)`);
console.log(`${x} valor(es) negativo(s)`);