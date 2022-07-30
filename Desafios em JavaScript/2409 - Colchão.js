var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var l = lines.shift().split(" ");

var A = parseInt(l.shift());
var B = parseInt(l.shift());
var C = parseInt(l.shift());

var l1 = lines.shift().split(" ");

var H = parseInt(l1.shift());
var L = parseInt(l1.shift());

if (A <= H && B <= L)
{
    console.log("S");
} 
else if (A <= H && C <= L)
{
    console.log("S");
} 
else if (B <= H && A <= L)
{
    console.log("S");
} 
else if (B <= H && C <= L)
{
    console.log("S");
} 
else if (C <= H && A <= L)
{
    console.log("S");
} 
else if (C <= H && B <= L)
{
    console.log("S");
} 
else 
{
    console.log("N");
}
