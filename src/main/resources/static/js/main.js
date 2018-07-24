/**
 * 
 */

$(document).ready(function(){
	alert("loaded");
	
	$(".table .eBtn").on("click",function(event){
		$(".myform #exampleModal").modal();
	});
});