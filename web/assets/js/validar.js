/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$().ready(function() {
    $("#validar-form").validate({
        rules: {
            titulo: {required: true, minlength: 2},
            lugar: {required: true, minlength: 2},
            nombre: {required: true, minlength: 2},
            informacion: {required: true},
            descripcion: {required: true, minlength: 2},
            horario: {required: true, minlength: 2},
            correo: {required: true, email: true},
            contrasenia: {required: true},
            fecha: {required: true},
            
            
                        autor: { required: true, minlength: 2},
                        contenido: { required:true, minlength: 2},
                        nombreCategoria: { required: true, minlength: 2}
                  
        },
        messages: {
            nombre: " * obligatorio ",
            fecha: " * obligatorio ",
            titulo: " * obligatorio ",
            autor: " * obligatorio ",
            lugar: " * obligatorio ",
            categoria: " * obligatorio ",
            correo: " * obligatorio ",
            contrasenia: " * obligatorio ",
            informacion: " * obligatorio ",
            telefono: "El campo Tel&eacute;fono no contiene un formato correcto.",
            horario: " * obligatorio ",
            contenido: " * obligatorio ",
            descripcion: " * obligatorio ",
            validator: "Inerte los cuatro caracteres de la imagen superior.",
            nombreCategoria: " * obligatorio "

        },
        success: function(element) {
            element
                    .text('OK!').addClass('valid')
                    .closest('.control-group').removeClass('error').addClass('success');
        }
    });
});




