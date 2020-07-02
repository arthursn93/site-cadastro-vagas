
public class Login implements Autenticavel {
	
	private String loginUsuario;
	private int senha;
	
	public String getUsuario() {
		return this.loginUsuario;
	}

	public void setUsuario(String usuario) {
		this.loginUsuario = usuario;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
