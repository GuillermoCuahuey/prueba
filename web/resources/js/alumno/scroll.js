var time;

document.addEventListener("DOMContentLoaded",function (evt) {
    pageScroll();
    // activasion();
    var mouse = document.getElementById('scroll');
    mouse.addEventListener("click",function (evt) {
        clearTimeout(time);
    }).mouseout(function() {
        pageScroll();
    });
});

function pageScroll() {
    var objDiv = document.getElementById("scroll");
    objDiv.scrollTop = objDiv.scrollTop + 1;
    // if (objDiv.scrollTop == (objDiv.scrollHeight - 625)) {
    //     objDiv.scrollTop = 0;
    // }
    time = setTimeout('pageScroll()', 100);
}
