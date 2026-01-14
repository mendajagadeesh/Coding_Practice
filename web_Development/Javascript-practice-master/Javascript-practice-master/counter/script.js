const decreaseBtn = document.getElementById("decreaseBtn");
const resetBtn = document.getElementById("resetBtn");
const IncreaseBtn = document.getElementById("IncreaseBtn");
const labelcontent = document.getElementById("textcontent");
let count = 0;
decreaseBtn.onclick = function() {
    count--;
    labelcontent.textContent = count;
}
resetBtn.onclick = function() {
    count = 0;
    labelcontent.textContent = count;
}
IncreaseBtn.onclick = function() {
    count++;
    labelcontent.textContent = count;
}