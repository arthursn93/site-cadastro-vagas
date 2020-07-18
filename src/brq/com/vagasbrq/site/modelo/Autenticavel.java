package brq.com.vagasbrq.site.modelo;

public abstract interface Autenticavel {
	// passa definição de senha
	void setSenha(int senha);
	// passa método para autenticar a senha
	boolean autentica(int senha);

}
