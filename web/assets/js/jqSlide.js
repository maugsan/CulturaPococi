
$(document).ready(function() {

// SLIDE BANNER

    $("#slideshow").css("overflow", "hidden");

    $('#slides').cycle({
        fx: 'scrollRight',
        next: '#right',
        timeout: 0,
        easing: 'easeInOutBack'
    });

    $("#slideshow").hover(function() {
        //$("ul#controles").fadeIn();
        $("#slides").cycle("pause");
    }, function() {
        //$("ul#controles").fadeOut();
        $("#slides").cycle("resume");
    });

});
    