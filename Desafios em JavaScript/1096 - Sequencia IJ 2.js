var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var vet = [7, 6, 5];

var vet2 = new Array(15);

for (let i = 1; i < 10; i = i +2)
{
    let j=0;

    vet2[i]=i;

    console.log(`I=${vet2[i]} J=${vet[j]}`);
    j++;
    console.log(`I=${vet2[i]} J=${vet[j]}`);
    j++;
    console.log(`I=${vet2[i]} J=${vet[j]}`);

}