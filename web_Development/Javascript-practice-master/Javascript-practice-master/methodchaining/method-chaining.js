/*let username = window.prompt("enter your name");
username = username.trim();
let letter = username.charAt(0);
let cap = letter.toUpperCase();
let extra = username.trim();
let rem = extra.slice(1);
let whole = rem.toLowerCase();
username = cap + whole;
console.log(username);*/
let username = window.prompt("enter your name");
username = username.trim().charAt(0).toUpperCase() + username.trim().slice(1).toLowerCase();
console.log(username);