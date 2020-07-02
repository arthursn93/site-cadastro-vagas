
public class SistemaInterno{
	
	private int senha = 131;
 
	public boolean autentica(Autenticavel c) {
		boolean autenticou = c.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema.");
			return true;
		}else {
			System.out.println("Não pode entrar no sistema.");
			return false;
		}
	}
}
