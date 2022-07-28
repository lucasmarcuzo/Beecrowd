var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a, b, y=0;

a=parseInt(lines.shift());
b=parseInt(lines.shift());

if(a == b)
{
    y=0;

}
else if(a < b)
{
    for(a= a+1; a < b; a++){
        
        if(a%2==1||a%2==-1)
        y+=a;
    }

}
else if(a > b)
{
    for(b= b+1; b < a; b++){
        
        if(b%2==1||b%2==-1)
        y+=b;
    }

} 

console.log(y); 