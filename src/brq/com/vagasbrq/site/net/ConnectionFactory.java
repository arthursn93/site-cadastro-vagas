package brq.com.vagasbrq.site.net;

import java.sql.*;

public class ConnectionFactory {
		
		public Connection getConnection() {
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				return DriverManager.getConnection("jdbc:mysql://localhost/vagas?useTimezone=true&serverTimezone=America/Sao_Paulo","root","Os900porcos_");
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);	
			}
		}
	}

