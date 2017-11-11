package dominio;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_cabanaocasa")


public class CabanaOCasa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codCabanaOCasa;
	
	private String ubicacion;
	private BigDecimal precioDiaria;
	private String foto;
	private boolean disponible;
	private String cuidad;
	private Integer nroBanos;
	private Integer nroHabitaciones;
	
	public CabanaOCasa() {
		super();
	}

	public CabanaOCasa(Integer codCabanaOCasa, String ubicacion, BigDecimal precioDiaria, String foto,
			boolean disponible, String cuidad, Integer nroBanos, Integer nroHabitaciones) {
		super();
		this.codCabanaOCasa = codCabanaOCasa;
		this.ubicacion = ubicacion;
		this.precioDiaria = precioDiaria;
		this.foto = foto;
		this.disponible = disponible;
		this.cuidad = cuidad;
		this.nroBanos = nroBanos;
		this.nroHabitaciones = nroHabitaciones;
	}

	public Integer getCodCabanaOCasa() {
		return codCabanaOCasa;
	}

	public void setCodCabanaOCasa(Integer codCabanaOCasa) {
		this.codCabanaOCasa = codCabanaOCasa;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public BigDecimal getPrecioDiaria() {
		return precioDiaria;
	}

	public void setPrecioDiaria(BigDecimal precioDiaria) {
		this.precioDiaria = precioDiaria;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public Integer getNroBanos() {
		return nroBanos;
	}

	public void setNroBanos(Integer nroBanos) {
		this.nroBanos = nroBanos;
	}

	public Integer getNroHabitaciones() {
		return nroHabitaciones;
	}

	public void setNroHabitaciones(Integer nroHabitaciones) {
		this.nroHabitaciones = nroHabitaciones;
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
