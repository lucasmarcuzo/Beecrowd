var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var j = 1;
var x = parseInt(lines.shift());

var vet = new Array(x);

for (var i = 0; i < vet.length; i++)
{
    vet[i]=parseInt(lines.shift());
}

for (var vl of vet)
{
    console.log(`resposta ${j}: ${vl}`);
    j++;
}