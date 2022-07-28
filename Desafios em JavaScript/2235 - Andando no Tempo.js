var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a = parseInt(lines.shift());
var b = parseInt(lines.shift());
var c = parseInt(lines.shift());

if ((a + b) === c || (a + c) === b || (b + c) === a || a === b || b === c || a === c)  
{
    console.log("S");
}
else 
{
    console.log("N");
}