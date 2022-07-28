var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var horas, velocidade;
var distancia, combustivel=12.0;

horas=parseInt(lines.shift());
velocidade=parseInt(lines.shift());

distancia=parseFloat((velocidade*horas)/combustivel);

console.log(`${distancia.toFixed(3)}`);