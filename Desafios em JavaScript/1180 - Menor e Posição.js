var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n=parseInt(lines.shift());

var ln = lines.shift().split(` `);

var vet = new Array(n);

for (let i = 0; i <vet.length; i++)
{
    vet[i] = parseInt(ln.shift());
}

var menorValor = Math.min(...vet);
var posicao = vet.indexOf(menorValor);

console.log(`Menor valor: ${menorValor}`);
console.log(`Posicao: ${posicao}`);