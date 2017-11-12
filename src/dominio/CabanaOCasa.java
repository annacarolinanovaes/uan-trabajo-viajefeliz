package dominio;

import java.io.Serializable;
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
@Table(name="tb_cabanaocasa")

public class CabanaOCasa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codCabanaOCasa;
	private String nombreCabanaOCasa;
	private String ubicacionCabanaOCasa;
	private Double precioDiariaCabanaOCasa;
	private String fotoCabanaOCasa;
	private boolean disponibleCabanaOCasa;
	private String cuidadCabanaOCasa;
	private Integer nroBanosCabanaOCasa;
	private Integer nroHabitacionesCabanaOCasa;
	
	@ManyToOne
	@JoinColumn(name = "arrendatario")
	private Arrendatario arrendatario;
	
	@OneToMany(mappedBy = "cabanaOCasa")
	private List<EncuestaSatisfacion> encuestasatisfacion;
	
	public CabanaOCasa() {
		super();
	}

	public CabanaOCasa(Integer codCabanaOCasa, String nombreCabanaOCasa, Double precioDiariaCabanaOCasa, String fotoCabanaOCasa,
			boolean disponibleCabanaOCasa, String ubicacionCabanaOCasa, String cuidadCabanaOCasa, Integer nroBanosCabanaOCasa, Integer nroHabitacionesCabanaOCasa) {
		super();
		this.codCabanaOCasa = codCabanaOCasa;	
		this.nombreCabanaOCasa = nombreCabanaOCasa;
		this.precioDiariaCabanaOCasa = precioDiariaCabanaOCasa;
		this.fotoCabanaOCasa = fotoCabanaOCasa;
		this.disponibleCabanaOCasa = disponibleCabanaOCasa;
		this.ubicacionCabanaOCasa = ubicacionCabanaOCasa;
		this.cuidadCabanaOCasa = cuidadCabanaOCasa;
		this.nroBanosCabanaOCasa = nroBanosCabanaOCasa;
		this.nroHabitacionesCabanaOCasa = nroHabitacionesCabanaOCasa;
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

	public boolean isDisponibleCabanaOCasa() {
		return disponibleCabanaOCasa;
	}

	public void setDisponibleCabanaOCasa(boolean disponibleCabanaOCasa) {
		this.disponibleCabanaOCasa = disponibleCabanaOCasa;
	}

	public String getCuidadCabanaOCasa() {
		return cuidadCabanaOCasa;
	}

	public void setCuidadCabanaOCasa(String cuidadCabanaOCasa) {
		this.cuidadCabanaOCasa = cuidadCabanaOCasa;
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
	
}
