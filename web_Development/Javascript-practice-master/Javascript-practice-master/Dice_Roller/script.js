function roller() {

    let result = document.getElementById("result");
    let input = document.getElementById("input").value;
    let output = [];
    let images = [];
    for (let i = 0; i < input; i++) {
        let random = Math.floor(Math.random() * 6) + 1;
        output.push(random)
        images.push(`<img id="imgs" src="images/${random}dice.png" alt="dice-${random}">`);
        result.innerHTML = images.join(" ");
    }
}