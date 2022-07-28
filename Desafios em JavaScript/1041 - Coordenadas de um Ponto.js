var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var x, y, z=0.0;
    
x=parseFloat(lines.shift());
y=parseFloat(lines.shift());

if(x == z && y == z){
    console.log("Origem");   
}else if(x == z){               
    console.log("Eixo Y");   
}else if(y == z){       
    console.log("Eixo X");
}else if(x > z && y > z){  
    console.log("Q1");  
}else if(x < z && y > z){
    console.log("Q2");
}else if(x < z && y < z){
    console.log("Q3");     
}else if(x > z && y < z){
    console.log("Q4");     
}