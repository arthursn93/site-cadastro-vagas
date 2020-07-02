
public class siteTeste {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		Candidato usuario = new Candidato(23242423, "Designer");
		usuario.setSenha(121);
		si.autentica(usuario);
		
//		Usuario f = new Usuario(1233333,"Jorge");
//		Recrutador r = new Recrutador(3232323,"Marina");
//		Candidato c = new Candidato(5456456,"Esmeralda");
//		
//		f.setProfissao("Programador");
//		r.setEmpresa("BRQ");
//		
//		c.nivel.add("Júnior");
//		c.nivel.add("Pleno");
//		c.nivel.add("Sênior");
//		
//		System.out.println(f.getProfissao());
//		System.out.println(r.getEmpresa());
//		System.out.println(c.nivel.get(1));
	}

}
