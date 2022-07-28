var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let n=3.14159;
let raio = lines.shift();
let area=n * (parseFloat(Math.pow(raio, 2)));       
 
console.log(`A=${area.toFixed(4)}`);  