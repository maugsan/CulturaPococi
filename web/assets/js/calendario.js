/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

jQuery(function($){
$.datepicker.regional['es'] = {
closeText: 'Cerrar',
prevText: '&#x3c;Ant',
nextText: 'Sig&#x3e;',
currentText: 'Hoy',
monthNames: ['Enero','Febrero','Marzo','Abril','Mayo','Junio',
'Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'],
monthNamesShort: ['Ene','Feb','Mar','Abr','May','Jun',
'Jul','Ago','Sep','Oct','Nov','Dic'],
dayNames: ['Domingo','Lunes','Martes','Mi&eacute;rcoles','Jueves','Viernes','S&aacute;bado'],
dayNamesShort: ['Dom','Lun','Mar','Mi&eacute;','Juv','Vie','S&aacute;b'],
dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','S&aacute;'],
weekHeader: 'Sm',
dateFormat: 'yy/dd/mm',
firstDay: 1,
isRTL: false,
showMonthAfterYear: false,
yearSuffix: ''};
$.datepicker.setDefaults($.datepicker.regional['es']);
});    


 $(document).ready(function() {
           $("#datepicker").datepicker({ 
  showOn: 'button', 
  buttonImageOnly: true, 
buttonImage: '../assets/img/evento-icon.png'  
});
        });