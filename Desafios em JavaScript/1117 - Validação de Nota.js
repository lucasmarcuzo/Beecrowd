var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var m, n, t;

do
{
    m=parseFloat(lines.shift());

    if(m < 0.0 || m > 10.0)
    {
        console.log("nota invalida");
    }
    
} while (m < 0.0 || m > 10.0);

do
{
    n=parseFloat(lines.shift());

    if(n < 0.0 || n > 10.0)
    {
        console.log("nota invalida");
    }

} while (n < 0.0 || n > 10.0);


t=((m+n)/2);

console.log(`media = ${t.toFixed(2)}`);