var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var m, n, t=0;

var ln = lines.shift().split(` `);
m=parseInt(ln.shift());
n=parseInt(ln.shift());

while (m > 0 && n > 0){
    t=0;

    if(m <= 0 || n <= 0)
    {
    }
    else if(m >= n)
    {    let mn = "";
            for (let i = n; i <= m; i++)
            { 
                t+=i;
                mn += (i.toString() + " ");
            }
            mn.replace(undefined, "");
            console.log(`${mn}Sum=${t}`);
    }
    else if(n >= m)
    {
            let nm = "";
            for (let i = m; i <= n; i++)
            { 
                t+=i;
                nm += (i.toString() + " ");
            }
            nm.replace(undefined, "");
            console.log(`${nm}Sum=${t}`);
    }

    var ln = lines.shift().split(` `);
    m=parseInt(ln.shift());
    n=parseInt(ln.shift());

   
}