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
	@JoinColumn(name = "cabanaocasa")
	private CabanaOCasa cabanaocasa;
	
	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuarioCod;
	
	public EncuestaSatisfacion() {
		super();
	}

	public EncuestaSatisfacion(Integer codAvaliacion, Double nota, String descripcion, CabanaOCasa cabanaocasa,
			Usuario usuarioCod) {
		super();
		this.codAvaliacion = codAvaliacion;
		this.nota = nota;
		this.descripcion = descripcion;
		this.cabanaocasa = cabanaocasa;
		this.usuarioCod = usuarioCod;
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

	public CabanaOCasa getCabanaocasa() {
		return cabanaocasa;
	}

	public void setCabanaocasa(CabanaOCasa cabanaocasa) {
		this.cabanaocasa = cabanaocasa;
	}

	public Usuario getUsuarioCod() {
		return usuarioCod;
	}

	public void setUsuarioCod(Usuario usuarioCod) {
		this.usuarioCod = usuarioCod;
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
				+ ", cabanaocasa=" + cabanaocasa + ", usuario=" + usuarioCod + "]";
	}
	
}
