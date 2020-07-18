package brq.com.vagasbrq.site.modelo;

public class Recrutador extends Usuario {
	
	private String empresa;
	
	public Recrutador(String cpf, String profissao) {
		super(cpf, profissao);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}	
	
	
}
