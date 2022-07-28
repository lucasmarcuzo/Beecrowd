var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a = parseInt(lines.shift());
var b = parseInt(lines.shift());

var r = a % b;

if(r < 0) 
{
    r += Math.abs(b);
}

var q = (a - r) / b;

console.log(`${q} ${r}`);	
