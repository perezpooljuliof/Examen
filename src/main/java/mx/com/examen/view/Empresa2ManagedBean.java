package mx.com.examen.view;

import mx.com.examen.config.SpringContextResolver;
import mx.com.examen.dto.Empresa;
import mx.com.examen.service.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "empresaBean2", eager = true)
@RequestScoped
public class Empresa2ManagedBean {
	private String rfc;
	private String razonSocial;
	private String contacto;
	private String telefonoFijo;
	private String celular;
	private String email;

    private EmpresaServicio empresaServicio;

    public Empresa2ManagedBean() {
		ApplicationContext context = SpringContextResolver.getApplicationContext();
		empresaServicio = context.getBean(EmpresaServicio.class);
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
	public String guardar() {
		System.out.println("Guardando informacion de empresa.");
		Empresa empresa = new Empresa();
		empresa.setRazonSocial(this.razonSocial);
		empresa.setContacto(this.contacto);
		empresa.setTelefonoFijo(this.telefonoFijo);
		empresa.setCelular(this.celular);
		empresa.setRazonSocial(this.razonSocial);
		empresa.setEmail(this.email);

		empresaServicio.save(empresa);
		return "exito";
	}
}
