var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x=0, z=0, y=0, i=0;

x=parseInt(lines.shift());

do
{
    z=parseInt(lines.shift());

} while (z <= x);

y=x;
x=0;

while (x <= z)
{
    x+=y++;
    i++;
} 

console.log(i);