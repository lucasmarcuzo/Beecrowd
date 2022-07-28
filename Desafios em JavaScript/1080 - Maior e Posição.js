var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y, z;
x=y=z=0;

for(let i = 1; i < 101; i++){

    x=parseInt(lines.shift());

    if(x > y){
        y = x;
        z=i;
    }
}

console.log(y);
console.log(z);