package ar.edu.unlam.tallerweb1.controladores;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Paciente;
import ar.edu.unlam.tallerweb1.modelo.Turno;
import ar.edu.unlam.tallerweb1.servicios.ServicioBuscadorPacientes;

@Controller
public class ControladorPacientes {
	
	@Inject
	private ServicioBuscadorPacientes servicioBuscadorPacientes;
	
	@RequestMapping("/buscadorPaciente")
	public ModelAndView buscadorDePacientes(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("buscadorPacientes", modelo);
	}
	
	@RequestMapping("/buscarpacientesporapellido")
	public ModelAndView buscarPacientesPorApellido(@RequestParam String apellido){
		ModelMap modelo = new ModelMap();
		List <Paciente> listaPacientes = servicioBuscadorPacientes.listaPacientes(apellido);
		modelo.put("listapacientes",listaPacientes);
		return new ModelAndView("listaPacientes", modelo);
	}

	@RequestMapping("/buscarpacientespordni")
	public ModelAndView buscarPacientesPorDni(@RequestParam Long dni){
		ModelMap modelo = new ModelMap();
		List <Turno> listaTurnoPaciente = servicioBuscadorPacientes.listaTurnoPaciente(dni);
		modelo.put("listaturnopaciente", listaTurnoPaciente);
		return new ModelAndView("pacienteEncontrado", modelo);
	}
	
	@RequestMapping("/modificarestadoturno")
	public ModelAndView modificarEstadoTurno(@RequestParam Long id) {
		ModelMap modelo = new ModelMap();
		servicioBuscadorPacientes.modificarEstadoTurno(id);
		return new ModelAndView("buscadorPacientes", modelo);
	}
	
}