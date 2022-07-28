var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, x=0, y=0;

n=parseInt(lines.shift());

for (let i = 1; i <= n; i++)
{
    x=parseInt(lines.shift());

    y=0;

    for (let j=1; j < x; j++)
    {
        if(x % j === 0)
        {
            y+=j;
        } 
        
    }

    if(y == 1)
    {
        console.log(`${x} eh primo`);

    }else
    {
        console.log(`${x} nao eh primo`);
    }

}