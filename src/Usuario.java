
public abstract class Usuario{
	private String nome;
	private String profissao;
	private double salario;
	private int cpf;
	
	public Usuario(int cpf, String profissao) {
		this.cpf = cpf;
		this.profissao = profissao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}	
}
