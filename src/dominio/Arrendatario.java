package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_arrendatario")

public class Arrendatario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codArrendatario;
	
	private String nombreArrendatario;
	private Integer cedulaCuidadania;
	private String telefono;
	private String correoElectronicoArrendatario;
	
	public Arrendatario() {
		super();
	}

	public Arrendatario(Integer codArrendatario, String nombreArrendatario, Integer cedulaCuidadania, String telefono,
			String correoElectronicoArrendatario) {
		super();
		this.codArrendatario = codArrendatario;
		this.nombreArrendatario = nombreArrendatario;
		this.cedulaCuidadania = cedulaCuidadania;
		this.telefono = telefono;
		this.correoElectronicoArrendatario = correoElectronicoArrendatario;
	}

	public Integer getCodArrendatario() {
		return codArrendatario;
	}

	public void setCodArrendatario(Integer codArrendatario) {
		this.codArrendatario = codArrendatario;
	}

	public String getNombreArrendatario() {
		return nombreArrendatario;
	}

	public void setNombreArrendatario(String nombreArrendatario) {
		this.nombreArrendatario = nombreArrendatario;
	}

	public Integer getCedulaCuidadania() {
		return cedulaCuidadania;
	}

	public void setCedulaCuidadania(Integer cedulaCuidadania) {
		this.cedulaCuidadania = cedulaCuidadania;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronicoArrendatario() {
		return correoElectronicoArrendatario;
	}

	public void setCorreoElectronicoArrendatario(String correoElectronicoArrendatario) {
		this.correoElectronicoArrendatario = correoElectronicoArrendatario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codArrendatario == null) ? 0 : codArrendatario.hashCode());
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
		Arrendatario other = (Arrendatario) obj;
		if (codArrendatario == null) {
			if (other.codArrendatario != null)
				return false;
		} else if (!codArrendatario.equals(other.codArrendatario))
			return false;
		return true;
	}
	
	
	
}
