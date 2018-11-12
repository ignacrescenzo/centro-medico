package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Turno;

public interface TurnoDao {

	List<Turno> listaTurnos();

	List<String> turnosDisponibles(List<String> listaTurnos, Long especialidadId, Long medicoId, String fecha);

	void guardarTurno(Turno turno);

}
