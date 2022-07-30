var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
  
for (let i = 0; i < x; i++)
{
    var n = lines.shift();

    console.log(`${ (n - (Math.floor(Math.sqrt(n))))}`);
}
