const content = [{
        images: 'thumb-nails/html and css thumbnail.jpg',
        channel_pic: 'thumb-nails/channel-pic1.jpg',
        video_info: "HTML AND CSS FULL COURSE BEGINNING TO PRO|WATCH AND LEARN HERE",
        video: "https://youtu.be/G3e-cpL7ofc"
    },
    {
        images: 'thumb-nails/javascript thumbnail.webp',
        channel_pic: 'thumb-nails/channel-pic1.jpg',
        video_info: "JAVASCRIPT FULL COURSE BEGINNING TO PRO|WATCH AND LEARN HERE",
        video: "https://youtu.be/EerdGm-ehJQ"

    },
    {
        images: 'thumb-nails/react full course thumbnail.jpg',
        channel_pic: 'thumb-nails/channel-pic3.jpg',
        video_info: "REACT FULL COURSE|WATCH AND LEARN HERE",
        video: "https://www.youtube.com/watch?v=QFaFIcGhPoM&list=PLC3y8-rFHvwgg3vaYJgHGnModB54rxOk3"
    },
    {
        images: 'thumb-nails/computer networks thumbnail.jpg',
        channel_pic: 'thumb-nails/channel-pic4.jpg',
        video_info: "COMPUTER NETWORKS BASICS|WATCH AND LEARN HERE",
        video: "https://www.youtube.com/watch?v=VwN91x5i25g&list=PLBlnK6fEyqRgMCUAG0XRw78UA8qnv6jEx"
    },
    {
        images: 'thumb-nails/dsa with java thumbnail.jpg',
        channel_pic: 'thumb-nails/channel-pic5.jpg',
        video_info: "DSA WITH JAVA|WATCH AND LEARN HERE(not started)",
        video: "#coming soon"
    },
    {
        images: 'thumb-nails/operating system thumbnail.jpeg',
        channel_pic: 'thumb-nails/channel-pic6.jpg',
        video_info: "OPERATING SYSTEM|WATCH AND LEARN HERE",
        video: "https://www.youtube.com/watch?v=a3YDvmKbGrA&list=PL3eEXnCBViH-SiXK96TZd-7k3Qvk5g1YH"
    },
    {
        images: 'thumb-nails/database management system thumbnail.png',
        channel_pic: 'thumb-nails/channel-pic6.jpg',
        video_info: "DATABASE MANAGEMENT SYSTEM|WATCH AND LEARN HERE",
        video: "https://www.youtube.com/watch?v=3KWIQXWYIcM&list=PLPvaSRcEQh4kfVIyezAQu9Mvj5FBk_OEN"
    },
    {
        images: 'thumb-nails/java thumbnail.jpg',
        channel_pic: 'thumb-nails/channel-pic7.jpg',
        video_info: "JAVA COMPLETE TUTORIAL|WATCH AND LEARN HERE",
        video: "https://www.youtube.com/watch?v=bm0OyhwFDuY&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5"
    }
];
let htmlcontent = '';
content.forEach((data) => {
    htmlcontent += `
<div>
<div>
<a href="${data.video}" target="_self"><img class="img-class" src='${data.images}'></a>
</div
<div class="grid-div2">
<div class="channel-picture">
<img class="img-channel" src='${data.channel_pic}'>
</div>
<div class="video-info">
<p class="para1">${data.video_info.split('|')[0]}</p>
<p class="para2">${data.video_info.split('|')[1]}</p>
</div>
</div>
</div>`
});
document.querySelector(".js-dom-purpose").innerHTML = htmlcontent;
const right_section_buttons = [{
    upload_button: "images/upload.svg",
    yt_apps_button: "images/youtube-apps.svg",
    notifications: "images/notifications.svg",
    user: "images/favicon-32x32.png"
}];
let buttons = '';
right_section_buttons.forEach(() => {
    buttons += `<div class="right-section dom_purpose">
<button class="rs-butt rs-butt1"><img class="upload-img"src="images/upload.svg"></button>
<button class="rs-butt rs-butt2"><img class="upload-img" src="images/youtube-apps.svg"></button>
<button class="rs-butt rs-butt3"><img  class="upload-img" src="images/notifications.svg"></button>
<button class="rs-butt rs-butt4"><img  class="upload-img" src="images/favicon-32x32.png"></button>
</div>
</div>
</div>`

});
document.querySelector(".dom_purpose").innerHTML = buttons;
let data1 = document.querySelector(".rs-butt1");
let data2 = document.querySelector(".rs-butt2");
let data3 = document.querySelector(".rs-butt3");
let data4 = document.querySelector(".rs-butt4");

data1.addEventListener("click", function() {
    alert("clicked upload");
});

data2.addEventListener("click", function() {
    alert("clicked apps");
});

data3.addEventListener("click", function() {
    alert("clicked noti");
});

data4.addEventListener("click", function() {
    alert("clicked user");
});

const sidebar = [{
    home: "images/home.svg",
    explore: "images/explore.svg",
    subscriptions: "images/subscriptions.svg",
    originals: "images/originals.svg",
    music: "images/youtube-music.svg",
    library: "images/library.svg"
}];

let sidebarHTML = "";
sidebar.forEach(() => {
    sidebarHTML += `
    <div class="sidebar">
<div class="sidebar-content sidebar-content1"><img src="images/home.svg"><div>Home</div></div>
<div class="sidebar-content sidebar-content2"><img src="images/explore.svg"><div>Explore</div></div>
<div class="sidebar-content sidebar-content3"><img src="images/subscriptions.svg"><div>Subscriptions</div></div>
<div class="sidebar-content sidebar-content4"><img src="images/originals.svg"><div>Originals</div></div>
<div class="sidebar-content sidebar-content5"><img src="images/youtube-music.svg"><div>Youtube-Music</div></div>
<div class="sidebar-content sidebar-content6"><img src="images/library.svg"><div>Library</div></div>
</div>`
});
document.querySelector(".sidebar_dom").innerHTML = sidebarHTML;
let tool1 = document.querySelector(".sidebar-content1");
let tool2 = document.querySelector(".sidebar-content2");
let tool3 = document.querySelector(".sidebar-content3");
let tool4 = document.querySelector(".sidebar-content4");
let tool5 = document.querySelector(".sidebar-content5");
let tool6 = document.querySelector(".sidebar-content6");

tool1.addEventListener("click", () => {
    alert("you clicked home");
});

tool2.addEventListener("click", () => {
    alert("you clicked explore");
});

tool3.addEventListener("click", () => {
    alert("you clicked subscription");
});

tool4.addEventListener("click", () => {
    alert("you clicked original");
});

tool5.addEventListener("click", () => {
    alert("you clicked music");
});

tool6.addEventListener("click", () => {
    alert("you clicked library");
});