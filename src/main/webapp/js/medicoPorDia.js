$(document).ready(function() {
	 
	 var medicoId = $("#medicos option:selected").val();
	 var id = $("#especialidadId").val();
	 var fecha = $("#fecha").val();
	 var idDiaElegido = $("#especialidadId").val();
		
	 $("#botonSiguienteMedico").click(function(){
			window.location.assign("/proyecto-limpio-spring/turno/"+ id + "/dia/" + fecha + "/" + idDiaElegido + "/" + medicoId);
		});
	
});