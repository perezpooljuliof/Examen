package mx.com.examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "empresaid")
	private String empresaID;
	@Column(name = "razonsocial")
	private String razonSocial;
	@Column(name = "contacto")
	private String contacto;
	@Column(name = "telefonofijo")
	private String telefonoFijo;
	@Column(name = "celular")
	private String celular;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "direccionid")
	private Direccion direccion;
	@Column(name = "direccionid", insertable = false, updatable = false)
	private int direccionID;
	@Column(name = "email")
	private String email;
	
	public String getEmpresaID() {
		return empresaID;
	}
	public void setEmpresaID(String empresaID) {
		this.empresaID = empresaID;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getDireccionID() {
		return direccionID;
	}
	public void setDireccionID(int direccionID) {
		this.direccionID = direccionID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
