var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n=parseInt(lines.shift());

for (let i = 0; i < n; i++)
{
    var ln=lines.shift().split(" ");
    
    let t=0, r1=0, r2=0;

    r1 = parseInt(ln.shift());
    r2 = parseInt(ln.shift());

    t=r1+r2;

    console.log(t);

}