package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(String ip, Integer port, String user, String password, String database) {
		try {
			return DriverManager.getConnection("jdbc:postgresql://" + ip + ":" + port + "/" + database, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
