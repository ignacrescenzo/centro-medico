$(document).ready(function() {
	 
	 
	 var id = $("#especialidadId").val();
	 var fecha = $("#fecha").val();
	 var idDiaElegido = $("#especialidadId").val();
		
	 $("#botonSiguienteMedico").click(function(){
		 var medicoId = $("#medicos option:selected").val();
			window.location.assign(window.context +"/turno/"+ id + "/dia/" + fecha + "/" + idDiaElegido + "/" + medicoId);
		});
	 
	 $("#atras").click(function(){
			window.history.back();
		});	
	
});