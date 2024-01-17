var i = 0;

function show() {
    if(i >= 2) {
        i = 0
    } else {
        i++;
    }
    $("#slide ul").animate({left:i * 1920 * (-1)}, 500);
}

setInterval(show, 2300)