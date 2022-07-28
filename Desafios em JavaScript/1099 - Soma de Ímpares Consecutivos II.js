var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y, z, z1, z2;
x=y=z=0;

z=parseInt(lines.shift());

for (let i = 0; i < z; i++){

    var ln = lines.shift().split(` `);

    x=parseInt(ln.shift());
    y=parseInt(ln.shift());
    z1=z2=0;

    if(x > y)
    {   
        for (let j = y+1; j < x; j++)
        {
            if (j % 2 !== 0)
            {
                z1 += j;
            }
        }
            console.log(z1);
    }
    else
    {
        for (let k = x+1; k < y; k++)
        {
            if (k % 2 !== 0)
            {
                z2 += k;
            }
        }
            console.log(z2);
    }

}