var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

for (let i = 1001; i <= 9999; i++)
{
    let s=parseInt(lines.shift());

    s = s - 1;
    console.log(`${s}`);
}
