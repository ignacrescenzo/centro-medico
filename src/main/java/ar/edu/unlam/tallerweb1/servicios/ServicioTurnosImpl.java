package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.MedicoDao;
import ar.edu.unlam.tallerweb1.modelo.Medico;

@Service("servicioTurnos")
@Transactional
public class ServicioTurnosImpl implements ServicioTurnos {

	@Inject
	private MedicoDao servicioMedicoDao;
	
	@Override
	public List<String> consultarTurnos(int horaDesde, int minutoDesde, int horaHasta, int minutoHasta, int intervalo) {
		List <String> listaHorarios = new ArrayList<String>();
		while(horaDesde<horaHasta || (horaDesde==horaHasta && minutoDesde<=minutoHasta)) {
			listaHorarios.add(horaDesde+":"+(minutoDesde<10?minutoDesde+"0":minutoDesde));
			minutoDesde+=intervalo;
			if(minutoDesde>59)
				horaDesde++;
			minutoDesde%=60;
			
		}
		return listaHorarios;
	}

	public List<Medico> consultarMedico(){
		return servicioMedicoDao.consultarMedico();
	}
}
