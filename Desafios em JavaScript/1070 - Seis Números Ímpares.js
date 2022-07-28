var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x=parseInt(lines.shift())

if(x % 2 === 0){
    x++;
    for(let i=0; i<6; i++){
        console.log(x);
        x+=2;
    }
}
else if(x % 2 !== 0)
{
    for(let i=0; i<6; i++){
        console.log(x);
        x+=2;
    }
}
