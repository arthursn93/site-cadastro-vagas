package br.com.vagasbrq.site.teste;

import brq.com.vagasbrq.site.modelo.Candidato;
import brq.com.vagasbrq.site.modelo.UsuarioDao;

import java.sql.*;

public class TesteUsuario {

	public static void main(String[] args) {
		Candidato candidato = new Candidato("33333333333", "Designer");
		
		candidato.setNome("Pedro");
		candidato.setSalario(2200.0);
		candidato.getCpf();
		candidato.getProfissao();
		
		UsuarioDao dao = new UsuarioDao();
		dao.adiciona(candidato);
		
		System.out.println("Gravado!");	
	}

}
