let min = 1;
let max = 100;
let answer = Math.floor((Math.random() * max - min + 1) + min);
let attempts = 0;
let output = document.getElementById("ans");
let no_of_attempts = document.getElementById("attempt");
let button = document.getElementById("button");
let restart = document.getElementById("restartBtn");
let guess;
button.addEventListener("click", () => {
    answers();
});
restart.addEventListener("click", () => {
    answer = Math.floor((Math.random() * max - min + 1) + min);
    output.textContent = "";
    no_of_attempts.textContent = "";

});

function answers() {
    guess = document.getElementById("textcontent").value;
    guess = Number(guess);
    if (isNaN(guess)) {
        output.innerHTML = "invalid number. enter valid number";
    } else if (guess > 100 || guess < 1) {
        output.innerHTML = "invalid number. enter valid number";
    } else {
        attempts++;
        if (guess > answer) {
            output.innerHTML = "too big..! try again";
        } else if (guess < answer) {
            output.innerHTML = "too small..!try again";
        } else {
            if (guess === answer) {
                output.innerHTML = "you won the game";
                no_of_attempts.innerHTML = `No of Attempts:${attempts}`;
            }
        }
    }
}