package mx.com.examen.view;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import mx.com.examen.dto.Empresa;
import mx.com.examen.service.EmpresaServicio;

@Named
@Scope("session")
@ManagedBean(name = "empresaBean")
public class EmpresaManagedBean {
	private String rfc;
	private String razonSocial;
	private String contacto;
	private String telefonoFijo;
	private String celular;
	private String email;

	
	@Inject
    private EmpresaServicio empresaServicio;
	
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

	public EmpresaServicio getEmpresaServicio() {
		return empresaServicio;
	}
	public void setEmpresaServicio(EmpresaServicio empresaServicio) {
		this.empresaServicio = empresaServicio;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Funcion para guardar la informacion de la empresa
	 */
	public void guardar() {
		System.out.println("Guardando informacion de empresa.");
		Empresa empresa = new Empresa();
		empresa.setRazonSocial(this.razonSocial);
		empresa.setContacto(this.contacto);
		empresa.setTelefonoFijo(this.telefonoFijo);
		empresa.setCelular(this.celular);
		empresa.setRazonSocial(this.razonSocial);
		empresa.setEmail(this.email);
		
		empresaServicio.save(empresa);
	}
}
