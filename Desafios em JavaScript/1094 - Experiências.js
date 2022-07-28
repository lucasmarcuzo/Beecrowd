var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n, C=0, R=0, S=0, x, coelhos=0, ratos=0, sapos=0, total;
var tc, tr, ts;
var y;

n=parseInt(lines.shift());

for (let i = 0; i < n; i++)
{
    var ln = lines.shift().split(" ");

    x=parseInt(ln.shift());
    y=ln.shift();

    if(y === 'C' || y === 'C\r')
    {
        C++;
        coelhos+=x;

    }
    else if(y === 'R' || y === 'R\r')
    {
        R++;
        ratos+=x;

    }
    else if(y === 'S' || y === 'S\r')
    {
        S++;
        sapos+=x;
    }
}

total=coelhos+ratos+sapos;

console.log(`Total: ${total} cobaias`);
console.log(`Total de coelhos: ${coelhos}`);
console.log(`Total de ratos: ${ratos}`);
console.log(`Total de sapos: ${sapos}`);

tc=parseFloat((coelhos/total)*100);
tr=parseFloat((ratos/total)*100);
ts=parseFloat((sapos/total)*100);

console.log(`Percentual de coelhos: ${tc.toFixed(2)} %`);
console.log(`Percentual de ratos: ${tr.toFixed(2)} %`);
console.log(`Percentual de sapos: ${ts.toFixed(2)} %`);