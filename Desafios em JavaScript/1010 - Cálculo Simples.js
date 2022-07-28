var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var item1 = lines.shift().split(" ");
var item2 = lines.shift().split(" ");

var cod1 = parseInt(item1.shift());
var qtd1 = parseInt(item1.shift());
var valor1 = parseFloat(item1.shift());

var cod2 = parseInt(item2.shift());
var qtd2 = parseInt(item2.shift());
var valor2 = parseFloat(item2.shift());

var total = parseFloat((valor1 * qtd1) + (valor2 * qtd2));

console.log(`VALOR A PAGAR: R$ ${total.toFixed(2)}`);