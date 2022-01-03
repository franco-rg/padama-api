package pe.franco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idservicios;
	
	@Column(name = "nombreservicio")
	private String nombreservicio;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "precio")
	private Double precio;
	
	/* start constructor */
	public Servicios() {
		// TODO Auto-generated constructor stub
	}

	public Servicios(Integer idservicios, String nombreservicio, String descripcion, String estado, String imagen,
			Double precio) {
		super();
		this.idservicios = idservicios;
		this.nombreservicio = nombreservicio;
		this.descripcion = descripcion;
		this.estado = estado;
		this.imagen = imagen;
		this.precio = precio;
	}

	public Servicios(Integer idservicios, String nombreservicio, String descripcion, String estado, Double precio) {
		super();
		this.idservicios = idservicios;
		this.nombreservicio = nombreservicio;
		this.descripcion = descripcion;
		this.estado = estado;
		this.precio = precio;
	}

	public Servicios(String nombreservicio, String descripcion, String estado, Double precio) {
		super();
		this.nombreservicio = nombreservicio;
		this.descripcion = descripcion;
		this.estado = estado;
		this.precio = precio;
	}

	/* getter and setter */
	public Integer getIdservicios() {
		return idservicios;
	}

	public void setIdservicios(Integer idservicios) {
		this.idservicios = idservicios;
	}

	public String getNombreservicio() {
		return nombreservicio;
	}

	public void setNombreservicio(String nombreservicio) {
		this.nombreservicio = nombreservicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
