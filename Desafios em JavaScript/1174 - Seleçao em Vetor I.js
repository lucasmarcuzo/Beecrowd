var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var i=0;
var vet = new Array(100);

do
{
    vet[i]=parseFloat(lines.shift());
    i++;

} while (i < 100);


for (let j = 0; j < vet.length; j++)
{
    if(vet[j] <= 10){

        console.log(`A[${j}] = ${vet[j].toFixed(1)}`);    
    }   
}
