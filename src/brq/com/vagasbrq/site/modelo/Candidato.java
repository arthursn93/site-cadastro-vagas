package brq.com.vagasbrq.site.modelo;
import java.util.ArrayList;

public class Candidato extends Usuario implements Autenticavel {
	
	ArrayList<String> nivel = new ArrayList<String>();
	
	private Login login;
	
	public Candidato(String cpf, String profissao) {
		super(cpf, profissao);
		this.login = new Login();
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public boolean autentica(int senha) {
		return this.login.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.login.setSenha(senha);
	}

}
