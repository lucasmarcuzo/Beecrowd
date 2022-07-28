var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y, soma = 0, i, aux = 0;

x=parseInt(lines.shift());
y=parseInt(lines.shift());

if (y < x){

    aux = x;
    x = y;
    y = aux;
}

for (i = x; i <= y; i++)
{
    if (i % 13 !== 0){
        soma += i;
    }
}

console.log(soma);