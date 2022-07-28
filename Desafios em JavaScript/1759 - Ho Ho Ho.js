var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var N = parseInt(lines.shift());
var result = "";
        
for (let i = 0; i < N; i++) 
{
    if (i < N-1) 
    {
       result += "Ho ";  
    }
    else
    {
       console.log(result + "Ho!");
    }
}