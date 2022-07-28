var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var v=0, i=1, x=1, z=60;
        
while (i <= 13)
{
    v=x;
    x=x+3;
    i++;

    console.log(`I=${v} J=${z}`);
    z-=5;
}