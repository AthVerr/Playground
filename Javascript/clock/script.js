const HOURHAND = document.querySelector("#hour");
const MINUTEHAND = document.querySelector("#minute");
const SECONDHAND = document.querySelector("#second");

var date = new Date();
let hr = date.getHours();
let min = date.getMinutes();
let sec = date.getSeconds();


let hourPos = (hr*360/12)+(min*(360/60)/12);
let minPos = (min*360/60)+(sec*(360/60)/60);
let secPos =sec*360/60;

function runClock(){

  hourPos = hourPos + (3/360);
  minPos = minPos +(6/60);
  secPos = secPos + 6;

  HOURHAND.style.transform = "rotate(" + hourPos + "deg)";
  MINUTEHAND.style.transform = "rotate(" + minPos + "deg)";
  SECONDHAND.style.transform = "rotate(" + secPos + "deg)";

}

var interval = setInterval(runClock,1000);