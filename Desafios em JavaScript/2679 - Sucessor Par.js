var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x = parseInt(lines.shift());
            
while(true){
    if(x % 2 !== 0)
    {
        x++;
        console.log(`${x}`);
        break;
    }
    else
    {
        x += 2;
        console.log(`${x}`);
        break;
        
    }
}