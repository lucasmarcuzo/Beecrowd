var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y;
var n=parseInt(lines.shift());

for (let i = 0; i < n; i++)
{
    let ln = lines.shift().split(` `);

    x = ln.shift();
    y = parseInt(ln.shift());

    if(x === "Thor"){

        console.log("Y");

    }else{

        console.log("N");
    }
}