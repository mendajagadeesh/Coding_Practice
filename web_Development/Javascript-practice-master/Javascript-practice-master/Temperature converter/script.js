let output = document.getElementById("solution");
let button = document.getElementById("btn");
let toFahrenheit = document.getElementById("toFahrenheit");
let toCelsius = document.getElementById("toCelsius");
button.addEventListener("click", () => {
    let number = document.getElementById("number").value;
    num = Number(number);
    if (toFahrenheit.checked && number) {
        output.textContent = (num * 9 / 5) + 32 + "°F";
    } else if (toCelsius.checked && number) {
        output.textContent = (num - 32) * 5 / 9 + "°C";
    } else {
        output.textContent = " Enter value and Select your Choice"
    }
});