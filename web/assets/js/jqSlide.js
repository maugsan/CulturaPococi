
$(document).ready(function() {

// SLIDE BANNER

    $("#slideshow").css("overflow", "hidden");

    $('#slides').cycle({
        delay: 2000,
        speed: 500,
        prev: '#cAtras',
        next: '#cAdelante',
        timeout: 0
    });

    $("#slideshow").hover(function() {
        //$("ul#controles").fadeIn();
        $("#slides").cycle("pause");
    }, function() {
        //$("ul#controles").fadeOut();
        $("#slides").cycle("resume");
    });

});
    


