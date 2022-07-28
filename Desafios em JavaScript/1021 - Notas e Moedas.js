var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var dinheiro = parseFloat(lines.shift());
var valor = [ 100, 50, 20, 10, 5, 2, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 ];
var quantidade_notas = parseInt(dinheiro);
var quantidade_moedas = parseInt((dinheiro - quantidade_notas) * 100);

console.log("NOTAS:");
for (var i=0;i<6;i++)
{
    quantidade_notas = parseInt(dinheiro / valor[i]);
    console.log(`${quantidade_notas} nota(s) de R$ ${valor[i].toFixed(2)}`);
    dinheiro -= quantidade_notas * valor[i];

}
console.log("MOEDAS:");
for (var i = 6; i <= 11; i++)
{
    quantidade_moedas = parseInt(dinheiro / valor[i]);
    console.log(`${quantidade_moedas} moeda(s) de R$ ${valor[i].toFixed(2)}`);
    dinheiro -= quantidade_moedas * valor[i];
    dinheiro = Math.round(dinheiro * 100.0)/100.0;
}

