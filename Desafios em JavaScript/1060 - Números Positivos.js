var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x=0;

var vetor = new Array(6);

for(let i=0; i< vetor.length; i++)
{
    vetor[i]=parseFloat(lines.shift());
}

for (let i=0; i<vetor.length; i++)
{
    if(vetor[i]>0){

        x++;
    }
}

console.log(`${x} valores positivos`);