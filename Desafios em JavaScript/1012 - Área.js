var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var values = [3];

values[0]=parseFloat(lines.shift());
values[1]=parseFloat(lines.shift());
values[2]=parseFloat(lines.shift());

console.log(`TRIANGULO: ${((values[0] * values[2]) /2).toFixed(3)}`);
console.log(`CIRCULO: ${((3.14159*(values[2] * values[2]))).toFixed(3)}`);
console.log(`TRAPEZIO: ${((((values[0] + values[1])) * values[2]) / 2).toFixed(3)}`);
console.log(`QUADRADO: ${(values[1] * values[1]).toFixed(3)}`);
console.log(`RETANGULO: ${((values[0] * values[1])).toFixed(3)}`); 