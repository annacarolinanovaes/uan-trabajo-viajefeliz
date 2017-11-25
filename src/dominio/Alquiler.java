package dominio;

import java.io.Serializable;
import java.util.Date;

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
	private String fechaInicio;
	private String fechaFin;
	private int cantidadPersonas;
	private boolean pago;
	
	@ManyToOne
	@JoinColumn(name = "usuarioSeleccionado")
	private Usuario usuarioSeleccionado;
	
	@ManyToOne
	@JoinColumn(name = "cabanaOCasa")
	private CabanaOCasa cabanaOCasa;
	
	public Alquiler() {
		super();
	}

	public Alquiler(Integer codAlquiler, String fechaInicio, String fechaFin, int cantidadPersonas, boolean pago,
			Usuario usuarioSeleccionado, CabanaOCasa cabanaOCasa) {
		super();
		this.codAlquiler = codAlquiler;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadPersonas = cantidadPersonas;
		this.pago = pago;
		this.usuarioSeleccionado = usuarioSeleccionado;
		this.cabanaOCasa = cabanaOCasa;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Usuario getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
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
				+ ", cantidadPersonas=" + cantidadPersonas + ", pago=" + pago + ", usuarioSeleccionado="
				+ usuarioSeleccionado + ", cabanaOCasa=" + cabanaOCasa + "]";
	}

}