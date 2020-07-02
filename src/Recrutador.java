
public class Recrutador extends Usuario {
	
	private String empresa;
	
	public Recrutador(int cpf, String profissao) {
		super(cpf, profissao);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}	
	
	
}
