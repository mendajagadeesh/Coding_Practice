let choose = ["Rock", "Paper", "Scissor"];
let pscore = 0;
let cscore = 0;
let result = document.getElementById("result");
let playerchoose = document.getElementById("choose");
let computerchoose = document.getElementById("computer_choose");
let personScore = document.getElementById("personScore");
let computerScore = document.getElementById("computerScore");
personScore.classList.add("greentxt");
computerScore.classList.add("redtxt");

function userchoice(playerchoice) {
    let computerchoice = choose[Math.floor(Math.random() * 3)];
    let outcome = "";
    playerchoose.textContent = `person choose :${playerchoice}`;
    computerchoose.textContent = `computer choose :${computerchoice}`;
    if (playerchoice === computerchoice)
        outcome = `It's Tie`;

    else {
        switch (playerchoice) {
            case "Rock":
                outcome = (computerchoice === "Scissor") ? "You Win" : "You Lose";
                break;
            case "Paper":
                outcome = (computerchoice === "Scissor") ? "You Lose" : "You Win";
                break;
            case "Scissor":
                outcome = (computerchoice === "Rock") ? "You Lose" : "You Win";
                break;
        }
    }
    result.textContent = `${outcome}`;
    result.classList.remove("greentxt", "redtxt", "bluetxt");
    if (outcome === "You Win") {
        result.classList.add("greentxt");
        pscore++;
        personScore.textContent = pscore;
    } else if (outcome === "You Lose") {
        result.classList.add("redtxt");
        cscore++;
        computerScore.textContent = cscore;
    } else {
        result.classList.add("bluetxt");
    }

}