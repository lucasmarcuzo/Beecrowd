var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());

for(let i=1; i <= x; i++)
{
    let v = lines.shift().split(" ");
    console.log("I am Toorg!");
}