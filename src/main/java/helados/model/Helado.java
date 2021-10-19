package helados.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Información del Helado")
@Entity
@Table(name = "helado")
public class Helado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_helado;

	@ApiModelProperty(notes = "Nombre de helado debe tener al menos 8")
	@Size(min = 1, max = 50, message = "nombres minimo 8 caracteres")
	@Column(name = "nombre", nullable = false, length = 50)
	String descripcion;

	@ApiModelProperty(notes = "Sabor del helado")
	@Column(name = "sabor", nullable = false, length = 50)
	String sabor;
	
	@ApiModelProperty(notes = "El precio con 2 decimales")
	@Digits(integer=10, fraction=2)
	@Column(name = "precio", nullable = false)
	Float precio;
	
	@ManyToOne
	@JoinColumn(name="id_marca", 
	nullable = false, 
	foreignKey = @ForeignKey(name = "marcaHelado"))
	Marca marca;

	public Integer getId() {
		return id_helado;
	}

	public void setId	(Integer id_helado) {
		this.id_helado = id_helado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	

}