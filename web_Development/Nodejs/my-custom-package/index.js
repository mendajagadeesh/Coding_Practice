const  upperCase = require("upper-case").upperCase;

//const uppercase=require("upper-case").upperCase;

function greet(name){
    console.log(upperCase(`Hello ${name} welcome to node`));
}
greet("jagadeesh");
module.exports=greet;