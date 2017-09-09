// Set up!
var a_canvas = document.getElementById("a");
var context = a_canvas.getContext("2d");

// Write "Hello, World!"
context.font = "30px Garamond";
context.fillText("PORCUPINE",170,50);



// Draw the right eye
context.beginPath();
context.arc(250, 250, 150, 0, 2*Math.PI);
context.closePath();
context.stroke();



// Draw the right eye
context.beginPath();
context.arc(250, 250, 5, 0, 2*Math.PI);
context.closePath();
context.fill();



// Draw the right eye
context.beginPath();
context.arc(250, 400, 5, 0, 2*Math.PI);
context.closePath();
context.fill();


// Draw the left eye
context.beginPath();
context.arc(200, 400, 5, 0, 2*Math.PI);
context.closePath();
context.fill();

