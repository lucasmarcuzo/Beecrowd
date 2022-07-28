var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var x1,y1,x2,y2;

while(true){

    let ln = lines.shift().split(" ");

    x1 = parseInt(ln.shift());
    y1 = parseInt(ln.shift());
    x2 = parseInt(ln.shift());
    y2 = parseInt(ln.shift());
    if(x1 === 0 && y1 === 0 && x2 === 0 && y2 === 0){
        break; 
    }
    if(x1 === x2 && y1 === y2)
    {
        console.log("0");
    }	
    else if((x2-x1) === -(y2-y1) || -(x2-x1) === -(y2-y1) || -(x2-x1) === (y2-y1) || (x2-x1) === (y2-y1))
    {
        console.log("1");
    }	
    else if(x1 === x2 || y1 === y2)
    {
        console.log("1");	
    }
    else 
    {
        console.log("2");	
    }
}