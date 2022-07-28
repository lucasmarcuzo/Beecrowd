var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());

for (let i = 1; i <= n; i++){

    let q = parseInt(Math.pow(i, 2));
    let q1 = parseInt(Math.pow(i, 2)+1);
    let c = parseInt(Math.pow(i, 3));
    let c1 = parseInt(Math.pow(i, 3)+1);

    console.log(`${i} ${q} ${c}`);
    console.log(`${i} ${q1} ${c1}`);
}