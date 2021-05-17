package mx.com.examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "direccion")
public class Direccion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "direccionid")
	private int direccionID;
	@Column(name = "calle")
	private String calle;
	@Column(name = "nointerior")
	private String noInterior;
	@Column(name = "noexterior")
	private String noExterior;
	@Column(name = "codigopostal")
	private String codigoPostal;
	@Column(name = "cruzamientos")
	private String cruzamientos;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "colonia")
	private String colonia;
	@Column(name = "pais")
	private String pais;
	@Column(name = "estado")
	private String estado;
	
	public int getDireccionID() {
		return direccionID;
	}
	public void setDireccionID(int direccionID) {
		this.direccionID = direccionID;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNoInterior() {
		return noInterior;
	}
	public void setNoInterior(String noInterior) {
		this.noInterior = noInterior;
	}
	public String getNoExterior() {
		return noExterior;
	}
	public void setNoExterior(String noExterior) {
		this.noExterior = noExterior;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCruzamientos() {
		return cruzamientos;
	}
	public void setCruzamientos(String cruzamientos) {
		this.cruzamientos = cruzamientos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
