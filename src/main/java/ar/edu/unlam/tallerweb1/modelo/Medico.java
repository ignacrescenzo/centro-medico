package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Especialidad especialidad;
<<<<<<< HEAD
	private Integer horaDesde;
	private Integer minutoDesde;
	private Integer horaHasta;
	private Integer minutoHasta;
	
	@OneToOne
	private Consultorio consultorio;
	
	@ManyToMany(mappedBy="Medicos", cascade = CascadeType.ALL)
	List <DiasLaborales> diasLaborales = new ArrayList<DiasLaborales>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public Integer getHoraDesde() {
		return horaDesde;
	}
	public void setHoraDesde(Integer horaDesde) {
		this.horaDesde = horaDesde;
	}
	public Integer getMinutoDesde() {
		return minutoDesde;
	}
	public void setMinutoDesde(Integer minutoDesde) {
		this.minutoDesde = minutoDesde;
	}
	public Integer getHoraHasta() {
		return horaHasta;
	}
	public void setHoraHasta(Integer horaHasta) {
		this.horaHasta = horaHasta;
	}
	public Integer getMinutoHasta() {
		return minutoHasta;
	}
	public void setMinutoHasta(Integer minutoHasta) {
		this.minutoHasta = minutoHasta;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
	public List<DiasLaborales> getDiasLaborales() {
		return diasLaborales;
	}
=======
	
	private String horaDesde;
	
	private String minutoDesde;
	
	private String horaHasta;
	
	private String minutoHasta;
	
	@OneToOne
	private Consultorio consultorio;
	
	@ManyToMany(mappedBy="Medicos", cascade = CascadeType.ALL)
	List <DiasLaborales> diasLaborales = new ArrayList<DiasLaborales>();
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	public String getHoraDesde() {
		return horaDesde;
	}
	
	public void setHoraDesde(String horaDesde) {
		this.horaDesde = horaDesde;
	}
	
	public String getMinutoDesde() {
		return minutoDesde;
	}
	
	public void setMinutoDesde(String minutoDesde) {
		this.minutoDesde = minutoDesde;
	}
	
	public String getHoraHasta() {
		return horaHasta;
	}
	
	public void setHoraHasta(String horaHasta) {
		this.horaHasta = horaHasta;
	}
	
	public String getMinutoHasta() {
		return minutoHasta;
	}
	
	public void setMinutoHasta(String minutoHasta) {
		this.minutoHasta = minutoHasta;
	}
	
	public Consultorio getConsultorio() {
		return consultorio;
	}
	
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
	
	public List<DiasLaborales> getDiasLaborales() {
		return diasLaborales;
	}
	
>>>>>>> branch 'master' of https://github.com/ignacrescenzo/centro-medico.git
	public void setDiasLaborales(List<DiasLaborales> diasLaborales) {
		this.diasLaborales = diasLaborales;
	}
	
	
	
}
