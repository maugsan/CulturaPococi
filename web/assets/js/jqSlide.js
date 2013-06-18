
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
    
    function deleteAllCookies() {
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
    	var cookie = cookies[i];
    	var eqPos = cookie.indexOf("=");
    	var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
    	document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
}

$(document).ready(function() {

    $("#radio").click(function() {

        NuevaVentana = window.open('', '', 'width=300,height=200');
        NuevaVentana.document.write("Nueva Ventana PequeÃ±a");
        NuevaVentana.location.assign("http://www.elfrentecr.org/player.html");

    } );


});