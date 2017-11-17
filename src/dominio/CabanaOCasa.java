package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tb_cabanaocasa")

public class CabanaOCasa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codCabanaOCasa;
	private String nombreCabanaOCasa;
	private String ubicacionCabanaOCasa;
	private Double precioDiariaCabanaOCasa;
	private String fotoCabanaOCasa;
	private String ciudadCabanaOCasa;
	private Integer nroBanosCabanaOCasa;
	private Integer nroHabitacionesCabanaOCasa;
	
	@ManyToOne
	@JoinColumn(name = "arrendatario")
	private Arrendatario arrendatario;
	@OneToMany(mappedBy = "cabanaOCasa")
	private List<Alquiler> alquileres;
	@OneToMany(mappedBy = "cabanaocasa")
	private List<EncuestaSatisfacion> encuestassatisfaciones;
	
	public CabanaOCasa() {
		this.alquileres = new ArrayList<>();
		this.encuestassatisfaciones = new ArrayList<>();
	}

	public CabanaOCasa(Integer codCabanaOCasa, String nombreCabanaOCasa, String ubicacionCabanaOCasa,
			Double precioDiariaCabanaOCasa, String fotoCabanaOCasa,
			String ciudadCabanaOCasa, Integer nroBanosCabanaOCasa, Integer nroHabitacionesCabanaOCasa,
			List<Alquiler> alquileres, Arrendatario arrendatario, List<EncuestaSatisfacion> encuestassatisfaciones) {
		super();
		this.codCabanaOCasa = codCabanaOCasa;
		this.nombreCabanaOCasa = nombreCabanaOCasa;
		this.ubicacionCabanaOCasa = ubicacionCabanaOCasa;
		this.precioDiariaCabanaOCasa = precioDiariaCabanaOCasa;
		this.fotoCabanaOCasa = fotoCabanaOCasa;
		this.ciudadCabanaOCasa = ciudadCabanaOCasa;
		this.nroBanosCabanaOCasa = nroBanosCabanaOCasa;
		this.nroHabitacionesCabanaOCasa = nroHabitacionesCabanaOCasa;
		this.alquileres = alquileres;
		this.arrendatario = arrendatario;
		this.encuestassatisfaciones = encuestassatisfaciones;
	}

	public Integer getCodCabanaOCasa() {
		return codCabanaOCasa;
	}

	public void setCodCabanaOCasa(Integer codCabanaOCasa) {
		this.codCabanaOCasa = codCabanaOCasa;
	}

	public String getNombreCabanaOCasa() {
		return nombreCabanaOCasa;
	}

	public void setNombreCabanaOCasa(String nombreCabanaOCasa) {
		this.nombreCabanaOCasa = nombreCabanaOCasa;
	}

	public String getUbicacionCabanaOCasa() {
		return ubicacionCabanaOCasa;
	}

	public void setUbicacionCabanaOCasa(String ubicacionCabanaOCasa) {
		this.ubicacionCabanaOCasa = ubicacionCabanaOCasa;
	}

	public Double getPrecioDiariaCabanaOCasa() {
		return precioDiariaCabanaOCasa;
	}

	public void setPrecioDiariaCabanaOCasa(Double precioDiariaCabanaOCasa) {
		this.precioDiariaCabanaOCasa = precioDiariaCabanaOCasa;
	}

	public String getFotoCabanaOCasa() {
		return fotoCabanaOCasa;
	}

	public void setFotoCabanaOCasa(String fotoCabanaOCasa) {
		this.fotoCabanaOCasa = fotoCabanaOCasa;
	}

	public String getCiudadCabanaOCasa() {
		return ciudadCabanaOCasa;
	}

	public void setCiudadCabanaOCasa(String ciudadCabanaOCasa) {
		this.ciudadCabanaOCasa = ciudadCabanaOCasa;
	}

	public Integer getNroBanosCabanaOCasa() {
		return nroBanosCabanaOCasa;
	}

	public void setNroBanosCabanaOCasa(Integer nroBanosCabanaOCasa) {
		this.nroBanosCabanaOCasa = nroBanosCabanaOCasa;
	}

	public Integer getNroHabitacionesCabanaOCasa() {
		return nroHabitacionesCabanaOCasa;
	}

	public void setNroHabitacionesCabanaOCasa(Integer nroHabitacionesCabanaOCasa) {
		this.nroHabitacionesCabanaOCasa = nroHabitacionesCabanaOCasa;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public Arrendatario getArrendatario() {
		return arrendatario;
	}

	public void setArrendatario(Arrendatario arrendatario) {
		this.arrendatario = arrendatario;
	}

	public List<EncuestaSatisfacion> getEncuestassatisfaciones() {
		return encuestassatisfaciones;
	}

	public void setEncuestasatisfaciones(List<EncuestaSatisfacion> encuestassatisfaciones) {
		this.encuestassatisfaciones = encuestassatisfaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCabanaOCasa == null) ? 0 : codCabanaOCasa.hashCode());
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
		CabanaOCasa other = (CabanaOCasa) obj;
		if (codCabanaOCasa == null) {
			if (other.codCabanaOCasa != null)
				return false;
		} else if (!codCabanaOCasa.equals(other.codCabanaOCasa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CabanaOCasa [codCabanaOCasa=" + codCabanaOCasa + ", nombreCabanaOCasa=" + nombreCabanaOCasa
				+ ", ubicacionCabanaOCasa=" + ubicacionCabanaOCasa + ", precioDiariaCabanaOCasa="
				+ precioDiariaCabanaOCasa + ", fotoCabanaOCasa=" + fotoCabanaOCasa + ", ciudadCabanaOCasa="
				+ ciudadCabanaOCasa + ", nroBanosCabanaOCasa=" + nroBanosCabanaOCasa + ", nroHabitacionesCabanaOCasa="
				+ nroHabitacionesCabanaOCasa + ", alquileres=" + alquileres + ", arrendatario=" + arrendatario
				+ ", encuestassatisfaciones=" + encuestassatisfaciones + "]";
	}
	
}
