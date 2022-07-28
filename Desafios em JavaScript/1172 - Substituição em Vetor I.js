var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var vet = new Array(10);

for (let i = 0; i <vet.length; i++)
{
    vet[i]=parseInt(lines.shift());

    if(vet[i] <= 0){

        vet[i] = 1;
    }
}

for (let i = 0; i <vet.length; i++)
{
    console.log(`X[${i}] = ${vet[i]}`);
}