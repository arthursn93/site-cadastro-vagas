package brq.com.vagasbrq.site.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import brq.com.vagasbrq.site.net.ConnectionFactory;

public class UsuarioDao {
	 
	// declara conexao
		private Connection con;

		// método para realizar conexão com banco de dados (vagas)
		public UsuarioDao() {
			this.con = new ConnectionFactory().getConnection();
		}

		public void adiciona(Usuario usuario) {
			String sql = "insert into usuario " + "(nome,profissao,salario,cpf)" + " values(?,?,?,?)";

			try {
				// prepared statement para inserção
				PreparedStatement stmt = con.prepareStatement(sql);

				// seta os valores
				stmt.setString(1, usuario.getNome());
				stmt.setString(2, usuario.getProfissao());
				stmt.setDouble(3, usuario.getSalario());
				stmt.setString(4, usuario.getCpf());

				// executa
				stmt.execute();
				stmt.close();
				
			} catch (SQLException e) {
				e.getStackTrace();
				throw new RuntimeException(e);
			}
		}
}
