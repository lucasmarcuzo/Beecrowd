var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = new Array(12);

for (let i = 0; i < 12; i++)
{
    x[i] = new Array(12);
}

var total = 0;

var tipo = lines.shift();

for (let i = 0; i < 12; i++)
{
    for (let j = 0; j < 12; j++)
    {
        x[i][j] = parseFloat(lines.shift());
    }
}

var total = 0;

for (let i = 5; i < 7; i++)
{      
    total += x[i][4];     
}

for (let j = 4; j < 8; j++)
{      
    total += x[j][3];     
}

for (let k = 3; k < 9; k++)
{      
    total += x[k][2];     
}

for (let l = 2; l < 10; l++)
{      
    total += x[l][1];     
}

for (let m = 1; m < 11; m++)
{      
    total += x[m][0];     
}

if (tipo == "S")
{
    console.log(`${total.toFixed(1)}`);
}
else if (tipo == "M")
{
    let result = (total/30.0);
    console.log(`${result.toFixed(1)}`);
}
