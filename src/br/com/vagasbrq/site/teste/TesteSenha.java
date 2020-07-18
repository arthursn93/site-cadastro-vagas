package br.com.vagasbrq.site.teste;

import brq.com.vagasbrq.site.modelo.Candidato;
import brq.com.vagasbrq.site.modelo.SistemaInterno;

public class TesteSenha {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		Candidato usuario = new Candidato("333.333.333-33", "Designer");
		usuario.setSenha(121);
		si.autentica(usuario);
		
//		Usuario f = new Usuario("332.222.222-22","Jorge");
//		Recrutador r = new Recrutador("111.111.111-11","Marina");
//		Candidato c = new Candidato("55.555.555-55","Esmeralda");
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
