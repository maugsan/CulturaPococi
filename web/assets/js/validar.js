/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$().ready(function() {
	$("#validar-form").validate({
		rules: {
			nombre: { required: true, minlength: 2},
                        titulo: { required: true, minlength: 2},
                        autor: { required: true, minlength: 2},
                        lugar: { required: true, minlength: 2},
			correo: { required:true, email: true},
			informacion: { required:true},
			horario: { required:true, minlength: 2},
                        contenido: { required:true, minlength: 2},
                        descripcion: { required:true, minlength: 2},
                        contrasenia: { required:true},
                        nombreCategoria: { required: true, minlength: 2}
                  
		},
		messages: {
			nombre: " * obligatorio ",
                        titulo: " * obligatorio ",
                        autor: " * obligatorio ",
                        lugar: " * obligatorio ",
                        categoria: " * obligatorio ",
			correo :  " * obligatorio ",
                        contrasenia: " * obligatorio ",
                        informacion: " * obligatorio ",
			telefono : "El campo Tel&eacute;fono no contiene un formato correcto.",
			horario : " * obligatorio ",
                        contenido: " * obligatorio ",
                        descripcion : " * obligatorio ",
			validator : "Inerte los cuatro caracteres de la imagen superior.",
                        nombreCategoria: " * obligatorio "
                        
		},
                success: function(element) {
                       element
                      .text('OK!').addClass('valid')
                      .closest('.control-group').removeClass('error').addClass('success');
                }
	});
});




