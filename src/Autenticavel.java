
public abstract interface Autenticavel {
	// passa defini��o de senha
	void setSenha(int senha);
	// passa m�todo para autenticar a senha
	boolean autentica(int senha);

}
