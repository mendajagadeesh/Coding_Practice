let myBox = document.getElementById("myBox");
let content = document.getElementById("content");
myBox.addEventListener("click", () => {
    content.innerHTML = "Ouch 🥵";
    myBox.style.backgroundColor = "tomato";
});

myBox.addEventListener("mouseover", () => {
    content.innerHTML = "Don't do it 😮";
    myBox.style.backgroundColor = "green";
});

myBox.addEventListener("mouseout", () => {
    content.innerHTML = "Click me 😉";
    myBox.style.backgroundColor = "powderblue";
});