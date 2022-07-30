var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, i;
var x;
    
n = parseInt(lines.shift());

for(i = 0; i < n; i++){

    x = parseFloat(lines.shift());

    var aux = Math.floor(Math.pow(2,x)/12000);
    console.log(`${aux} kg`);
}