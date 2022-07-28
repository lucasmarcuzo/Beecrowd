var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, x, y, z, j;

n=parseInt(lines.shift());

for (let i = 0; i < n; i++)
{
    var ln = lines.shift().split(` `);

    x = parseInt(ln.shift());
    y = parseInt(ln.shift());
    
    z=0;
    j=0;

    do
    {
        if(x % 2 !== 0)
        {
            z+=x;
            j++;
        }
        x++;
        
    } while (j != y); 

    console.log(z);
}