package dominio;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="tb_alquiler")


public class Alquiler implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codAlquiler;
	private Date fechaInicio;
	private Date fechaFin;
	private int CantidadPersonas;
	private boolean pago;
	
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuarioCod;
	
	@ManyToOne
	@JoinColumn(name = "cabanaocasa")
	private CabanaOCasa cabanaOCasa;
	
	public Alquiler() {
		super();
	}

	public Alquiler(Integer codAlquiler, Date fechaInicio, Date fechaFin, int cantidadPersonas, boolean pago,
			Usuario usuarioCod, CabanaOCasa cabanaOCasa) {
		super();
		this.codAlquiler = codAlquiler;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		CantidadPersonas = cantidadPersonas;
		this.pago = pago;
		this.usuarioCod = usuarioCod;
		this.cabanaOCasa = cabanaOCasa;
	}

	public int getCantidadPersonas() {
		return CantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		CantidadPersonas = cantidadPersonas;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
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
	
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Usuario getUsuarioCod() {
		return usuarioCod;
	}

	public void setUsuarioCod(Usuario usuarioCod) {
		this.usuarioCod = usuarioCod;
	}

	public CabanaOCasa getCabanaOCasa() {
		return cabanaOCasa;
	}

	public void setCabanaOCasa(CabanaOCasa cabanaOCasa) {
		this.cabanaOCasa = cabanaOCasa;
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

	@Override
	public String toString() {
		return "Alquiler [codAlquiler=" + codAlquiler + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", CantidadPersonas=" + CantidadPersonas + ", pago=" + pago + ", usuario=" + usuarioCod
				+ ", cabanaOCasa=" + cabanaOCasa + "]";
	}	

}