package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MysqlConexion{
	private String hostname;
	private String username;
	private String password;
	private String database;
	private int port = 3306;
	private Connection connection;

	public MysqlConexion(String hostname, String username, String password, String database) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		this.hostname = hostname;
		this.username = username;
		this.password = password;
		this.database = database;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	}

	public MysqlConexion(String hostname, int port, String username, String password, String database) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		this(hostname, username, password, database);
		this.port = port;
	}

	public void conectar() throws SQLException{
		connection = crearConexion();
	}

	public void cerrar(){
		try{
			if (connection != null)
				connection.close();
		}catch(Exception e){}
	}

	public ResultSet ejecutarQuery(String query) throws SQLException{
		Statement stmt = null;
		ResultSet rs = null;
		try {
    		stmt = connection.createStatement();
    		rs = stmt.executeQuery(query);
    	}
		catch (SQLException ex){
    		System.out.println("SQLException: " + ex.getMessage());
    		System.out.println("SQLState: " + ex.getSQLState());
    		System.out.println("VendorError: " + ex.getErrorCode());
    		throw ex;
    	}		
        return rs;
   	}


	public void ejecutarStatement(String query) throws SQLException{
		PreparedStatement preparedStmt = null;
		
		try {
    		preparedStmt  = connection.prepareStatement(query);
    		preparedStmt.executeUpdate();
    	}
		catch (SQLException ex){
    		System.out.println("SQLException: " + ex.getMessage());
    		System.out.println("SQLState: " + ex.getSQLState());
    		System.out.println("VendorError: " + ex.getErrorCode());
    		throw ex;
    	}	
    }


	private Connection crearConexion() throws SQLException{
	 	Connection conn = null;
		try {
			String cc = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", hostname, port, database, username, password);
		    conn = DriverManager.getConnection(cc);
		}catch (SQLException ex) {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    throw ex;
		}
		return conn;
	}
}