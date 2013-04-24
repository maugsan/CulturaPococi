
$(document).ready(function(){

// SLIDE BANNER

	$("#slideshow").css("overflow", "hidden");
	
	$("ul#slides").cycle({
		fx: 'scrollHorz',
		pause: 1,
		speed: 400,
		timeout: 4000,
		prev: '#cAtras',
		next: '#cAdelante'
	});
	
	$("#slideshow").hover(function() {
		//$("ul#controles").fadeIn();
		$("ul#slides").cycle("pause");
	},function() {
		//$("ul#controles").fadeOut();
		$("ul#slides").cycle("resume");
	});
	
});