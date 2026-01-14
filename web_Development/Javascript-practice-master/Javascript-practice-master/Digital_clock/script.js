function updateTime() {
    let now = new Date();
    let hours = now.getHours();
    let minutes = now.getMinutes(); //.toString.padstart(2, 0);
    let seconds = now.getSeconds();
    let ampm = hours >= 12 ? "PM" : "AM";
    hours = hours % 12 || 12;
    hours = hours < 10 ? "0" + hours : hours;
    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;
    document.getElementById("clock").textContent = `${hours}:${minutes}:${seconds} ${ampm}`

}
updateTime();
setInterval(updateTime, 1000);