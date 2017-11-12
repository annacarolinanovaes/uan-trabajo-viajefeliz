package dominio;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import Modelo.Cabana;
import Modelo.Titular;
@Entity
@Table(name="tb_alquiler")


public class Alquiler implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codAlquiler;
	private Date fechaInicio;
	private Date fechafin;
	private Usuario titular;
	private CabanaOCasa cabana;
	private int cantidadPersonasAHospedar;
	
	
	
	public Alquiler() {
		super();
	}

	

	public Alquiler(Integer codAlquiler, Date fechaInicio, Date fechafin, Usuario titular, CabanaOCasa cabana,
			int cantidadPersonasAHospedar) {
		super();
		this.codAlquiler = codAlquiler;
		this.fechaInicio = fechaInicio;
		this.fechafin = fechafin;
		this.titular = titular;
		this.cabana = cabana;
		this.cantidadPersonasAHospedar = cantidadPersonasAHospedar;
	}



	public Usuario getTitular() {
		return titular;
	}



	public void setTitular(Usuario titular) {
		this.titular = titular;
	}



	public CabanaOCasa getCabana() {
		return cabana;
	}



	public void setCabana(CabanaOCasa cabana) {
		this.cabana = cabana;
	}



	public int getCantidadPersonasAHospedar() {
		return cantidadPersonasAHospedar;
	}



	public void setCantidadPersonasAHospedar(int cantidadPersonasAHospedar) {
		this.cantidadPersonasAHospedar = cantidadPersonasAHospedar;
	}



	public Integer getCodAlquiler() {
		return codAlquiler;
	}

	public void setCodAlquiler(Integer codAlquiler) {
		this.codAlquiler = codAlquiler;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAlquiler == null) ? 0 : codAlquiler.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		if (codAlquiler == null) {
			if (other.codAlquiler != null)
				return false;
		} else if (!codAlquiler.equals(other.codAlquiler))
			return false;
		return true;
	}
	
	

}
