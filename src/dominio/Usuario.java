package dominio;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="tb_usuario")

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codUsuario;

	private String nombreUsuario;
	private String telefono;
	private String correoelectronico;
	private String contrasenha;
	
	public Usuario(){
		
	}
	
	public Usuario(Integer codUsuario, String nombreUsuario, String telefono, String correoelectronico,
			String contrasenha) {
		super();
		this.codUsuario = codUsuario;
		this.nombreUsuario = nombreUsuario;
		this.telefono = telefono;
		this.correoelectronico = correoelectronico;
		this.contrasenha = contrasenha;
	}

	public Integer getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (codUsuario == null) {
			if (other.codUsuario != null)
				return false;
		} else if (!codUsuario.equals(other.codUsuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [codUsuario=" + codUsuario + ", nombreUsuario=" + nombreUsuario + ", telefono=" + telefono
				+ ", correoelectronico=" + correoelectronico + ", contrasenha=" + contrasenha + "]";
	}
	
	
	
}
