var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split(' ');

var a, b, c;

a = parseInt(lines.shift());
b = parseInt(lines.shift());
c = parseInt(lines.shift());

if(a < b && a < c){

    console.log(a);

    if(b < c){

        console.log(b);
        console.log(c);
        console.log("");
        console.log(a);
        console.log(b);
        console.log(c);

    }else if(c < b){

        console.log(c);
        console.log(b);
        console.log("");
        console.log(a);
        console.log(b);
        console.log(c);
    }

}else if(b < a && b < c){

    console.log(b);

    if(a < c){

        console.log(a);
        console.log(c);
        console.log("");
        console.log(a);
        console.log(b);
        console.log(c);

    }else if(c < a){

        console.log(c);
        console.log(a);
        console.log("");
        console.log(a);
        console.log(b);
        console.log(c);
    }

}else if(c < a && c < b){

    console.log(c);

    if(b < a){

        console.log(b);
        console.log(a);
        console.log("");
        console.log(a);
        console.log(b);
        console.log(c);

    }else if(a < b){

        console.log(a);
        console.log(b);
        console.log("");
        console.log(a);
        console.log(b);
        console.log(c);
    }
}