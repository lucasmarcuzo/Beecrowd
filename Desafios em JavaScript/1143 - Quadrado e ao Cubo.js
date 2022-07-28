var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for (let i = 1; i <= n; i++){
    let q = parseInt(Math.pow(i, 2));
    let c = parseInt(Math.pow(i, 3));
    console.log(`${i} ${q} ${c}`);
}
