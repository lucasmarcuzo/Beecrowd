var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
var T, menor = 21, posMenor = 0;
var ln = lines.shift().split(" ");

for (let i = 1; i <= N; i++) {
 
    T = parseInt(ln.shift());
    if (menor > T) 
    {
        menor = T;
        posMenor = i;
    } 
}

console.log(posMenor);