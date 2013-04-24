
$(document).ready(function(){
		
	$("nav ul li a").click(function(){
		
		$("nav ul li a").removeClass("liSeleccionado");
		$(this).addClass("liSeleccionado");
	});
	

	// Accordion
	$("#accordion").accordion({ header: "span" }); 
	//icons: { 'header': '../../resources/images/footerICONS/moreOptions.png', 'headerSelected': '../../resources/images/footerICONS/lessOptions.png' }
	//hover states on the static widgets
	$('#dialog_link, ul#icons li').hover(
		function() { $(this).addClass('ui-state-hover'); }, 
		function() { $(this).removeClass('ui-state-hover'); }
	);
		
	
	$("#accordion span.optionAccordion").click(function(){
		
		$("#accordion span.optionAccordion").removeClass("optionAccoridonSelected");
		$(this).addClass("optionAccoridonSelected");
	});
	
	
});