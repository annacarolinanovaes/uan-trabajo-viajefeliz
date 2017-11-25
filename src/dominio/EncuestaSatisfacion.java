package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="tb_encuestasatisfacion")


public class EncuestaSatisfacion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codAvaliacion;
	
	private Double nota;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "cabanaOCasa2")
	private CabanaOCasa cabanaOCasa2;
	
	@ManyToOne
	@JoinColumn(name = "usuarioSeleccionado2")
	private Usuario usuarioSeleccionado2;
	
	public EncuestaSatisfacion() {
		super();
	}

	public EncuestaSatisfacion(Integer codAvaliacion, Double nota, String descripcion, CabanaOCasa cabanaOCasa2,
			Usuario usuarioSeleccionado2) {
		super();
		this.codAvaliacion = codAvaliacion;
		this.nota = nota;
		this.descripcion = descripcion;
		this.cabanaOCasa2 = cabanaOCasa2;
		this.usuarioSeleccionado2 = usuarioSeleccionado2;
	}

	public Integer getCodAvaliacion() {
		return codAvaliacion;
	}

	public void setCodAvaliacion(Integer codAvaliacion) {
		this.codAvaliacion = codAvaliacion;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CabanaOCasa getCabanaOCasa2() {
		return cabanaOCasa2;
	}

	public void setCabanaOCasa2(CabanaOCasa cabanaOCasa2) {
		this.cabanaOCasa2 = cabanaOCasa2;
	}

	public Usuario getUsuarioSeleccionado2() {
		return usuarioSeleccionado2;
	}

	public void setUsuarioSeleccionado2(Usuario usuarioSeleccionado2) {
		this.usuarioSeleccionado2 = usuarioSeleccionado2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAvaliacion == null) ? 0 : codAvaliacion.hashCode());
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
		EncuestaSatisfacion other = (EncuestaSatisfacion) obj;
		if (codAvaliacion == null) {
			if (other.codAvaliacion != null)
				return false;
		} else if (!codAvaliacion.equals(other.codAvaliacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EncuestaSatisfacion [codAvaliacion=" + codAvaliacion + ", nota=" + nota + ", descripcion=" + descripcion
				+ ", cabanaOCasa2=" + cabanaOCasa2 + ", usuarioSeleccionado2=" + usuarioSeleccionado2 + "]";
	}
	
}
