

function sleep(milliseconds) {
    var start = new Date().getTime();
    for (var i = 0; i < 1e7; i++) {
        if ((new Date().getTime() - start) > milliseconds) {
            break;
        }
    }
}

function eliminarPerfil(nombre) {
    $("#dialog-confirm").dialog({
        resizable: false,
        width: 500,
        height: 250,
        modal: true,
        buttons: {
            "Borrar": function() {
                $(this).dialog("close");


                location.href = '../eliminar_perfil.do?nombrePerfil=' + nombre;
                window.location = "../mostrarperfiles.do";

            },
            Cancel: function() {
                $(this).dialog("close");

            }
        }
    });

}
function cod(url) {
    
  

document.write(escape(url));


    
}

$(document).ready(function() {

    $("#radio").click(function() {

        NuevaVentana = window.open('', '', 'width=300,height=200');

        NuevaVentana.location.assign("http://www.elfrentecr.org/player.jsp");

    });


});


$(function() {
    var pull = $('#pull');
    menu = $('nav ul');
    menuHeight = menu.height();

    $(pull).on('click', function(e) {
        e.preventDefault();
        menu.slideToggle();
    });

    $(window).resize(function() {
        var w = $(window).width();
        if (w > 320 && menu.is(':hidden')) {
            menu.removeAttr('style');
        }
    });
});


 $(function() {
    $(".rslides").responsiveSlides();
  });
   // Slideshow 4
      $("#slider4").responsiveSlides({
       auto: false,
        pager: false,
        nav: true,
        speed: 500,
        maxwidth: 940, 
        manualControls: "true", 
        namespace: "large-btns"    
        
       
      });
 
