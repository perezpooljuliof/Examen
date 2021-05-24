package mx.com.examen.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "login", eager = true)
@RequestScoped
public class LoginManagedBean {
	private String usuario;
	private String password;
	
	public LoginManagedBean() {
		System.out.println("Login started!");
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
