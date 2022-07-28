var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

while(lines.length > 0)
{
    var x = parseInt(lines.shift());

    if (x.toString() === `NaN`)
    {
        break;   
    }
    else{
        if (x <= 0)
        {
            console.log("vai ter copa!"); 
        }
        else
        {
            console.log("vai ter duas!");
        }
    }
}