package mx.com.examen.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "login", eager = true)
@RequestScoped
public class LoginManagedBean {
	@ManagedProperty(value = "#{usuario}")
	private String usuario;
	@ManagedProperty(value = "#{password}")
	private String password;
	
	public LoginManagedBean() {
		System.out.println("HelloWorld started!");
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String iniciarSesion() {
		System.out.println("Iniciando Sesion");
		if("admin".equals(usuario) && "12345".equals(password)) {
			 return "empresa";
		}
		
		return "login";
	}
}
