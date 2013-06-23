

function sleep(milliseconds) {
    var start = new Date().getTime();
    for (var i = 0; i < 1e7; i++) {
        if ((new Date().getTime() - start) > milliseconds) {
            break;
        }
    }
}
function eliminarUsuario(correo) {
    $("#dialog-confirm").dialog({
        resizable: false,
        width: 500,
        height: 250,
        modal: true,
        buttons: {
            "Borrar": function() {
                $(this).dialog("close");

                location.href = './eliminar_usuario_normal.do?c=' + correo;
            },
            Cancel: function() {
                $(this).dialog("close");

            }
        }
    });

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

$(document).ready(function() {

    $("#radio").click(function() {

        NuevaVentana = window.open('', '', 'width=300,height=200');
        NuevaVentana.document.write("Nueva Ventana PequeÃ±a");
        NuevaVentana.location.assign("http://www.elfrentecr.org/player.html");

    } );


});

   
