package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tb_arrendatario")

public class Arrendatario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codArrendatario;
	
	private String nombreArrendatario;
	private String cedulaCuidadania;
	private String telefono;
	private String correoElectronicoArrendatario;
	private String direccionResidenciaArrendatario;
	private String nacionalidadArrendatario;
	private String contrasenhaArrendatario;
	
	@OneToMany(mappedBy = "arrendatario")
	private List<CabanaOCasa> cabanasocasas;
	
	public Arrendatario() {
		this.cabanasocasas = new ArrayList<>();
	}

	public Arrendatario(Integer codArrendatario, String nombreArrendatario, String cedulaCuidadania, String telefono,
			String correoElectronicoArrendatario, String direccionResidenciaArrendatario,
			String nacionalidadArrendatario, String contrasenhaArrendatario, List<CabanaOCasa> cabanasocasas) {
		super();
		this.codArrendatario = codArrendatario;
		this.nombreArrendatario = nombreArrendatario;
		this.cedulaCuidadania = cedulaCuidadania;
		this.telefono = telefono;
		this.correoElectronicoArrendatario = correoElectronicoArrendatario;
		this.direccionResidenciaArrendatario = direccionResidenciaArrendatario;
		this.nacionalidadArrendatario = nacionalidadArrendatario;
		this.contrasenhaArrendatario = contrasenhaArrendatario;
		this.cabanasocasas = cabanasocasas;
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

	public String getCedulaCuidadania() {
		return cedulaCuidadania;
	}

	public void setCedulaCuidadania(String cedulaCuidadania) {
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

	public List<CabanaOCasa> getCabanasocasas() {
		return cabanasocasas;
	}

	public void setCabanasocasas(List<CabanaOCasa> cabanasocasas) {
		this.cabanasocasas = cabanasocasas;
	}

	public String getDireccionResidenciaArrendatario() {
		return direccionResidenciaArrendatario;
	}

	public void setDireccionResidenciaArrendatario(String direccionResidenciaArrendatario) {
		this.direccionResidenciaArrendatario = direccionResidenciaArrendatario;
	}

	public String getNacionalidadArrendatario() {
		return nacionalidadArrendatario;
	}

	public void setNacionalidadArrendatario(String nacionalidadArrendatario) {
		this.nacionalidadArrendatario = nacionalidadArrendatario;
	}

	public String getContrasenhaArrendatario() {
		return contrasenhaArrendatario;
	}

	public void setContrasenhaArrendatario(String contrasenhaArrendatario) {
		this.contrasenhaArrendatario = contrasenhaArrendatario;
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

	@Override
	public String toString() {
		return "Arrendatario [codArrendatario=" + codArrendatario + ", nombreArrendatario=" + nombreArrendatario
				+ ", cedulaCuidadania=" + cedulaCuidadania + ", telefono=" + telefono
				+ ", correoElectronicoArrendatario=" + correoElectronicoArrendatario
				+ ", direccionResidenciaArrendatario=" + direccionResidenciaArrendatario + ", nacionalidadArrendatario="
				+ nacionalidadArrendatario + ", contrasenhaArrendatario=" + contrasenhaArrendatario + "]";
	}
	
}
