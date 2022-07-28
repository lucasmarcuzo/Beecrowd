var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x, y;

x=parseInt(lines.shift());
y=parseInt(lines.shift());

if(x > y){   

    for (let j = y+1; j < x; j++){
        
        if (j % 5 == 2 || j % 5 == 3){
            console.log(j);
        }
    }
}
else
{
    for (let k = x+1; k < y; k++){
        
        if (k % 5 == 2 || k % 5 == 3){
            console.log(k);

        }
    }
}
