package co.edu.eafit.nocomasolo.publicacion.data.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




import co.edu.eafit.nocomasolo.publicacion.data.dao.mongo.MongoPublicacionDAO;
import co.edu.eafit.nocomasolo.publicacion.data.dao.mongo.PublicacionDAO;

/**
 * Clase que gestiona la conexión con la base de datos.
 */
public class FactoryDAO {
	
	private static String MONGO_URL = "jdbc:mongo://localhost:27017/nocomasolo";
	private static String MONGO_DRIVER = "mongodb.jdbc.MongoDriver";
	private PublicacionDAO postDAO;
	private Connection con;

	public void iniciarContextoConexion() {
		try {
			Class.forName(MONGO_DRIVER);
			//con = DriverManager.getConnection(MONGO_URL, "meetings_user", "meetings_pwd");
		    con = DriverManager.getConnection(MONGO_URL, "", "");
			System.out.println("Se realizo conexion a " + MONGO_URL);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void finalizarContextoConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void iniciarTransaccion() {
		try {
			this.con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void finalizarTransaccion() {
		try {
			this.con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void abortarTransaccion(Exception e) {
		try {
			this.con.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		e.printStackTrace();
	}

/*	public UserDAO crearUserDAO() {
		if (this.userDAO == null) {
			this.userDAO = new MongoUserDAO();
			this.userDAO.setConexion(this.con);
			System.out.println("Creo UserDAO ");
		}
		return this.userDAO;
	}*/
	
	public PublicacionDAO crearPostDAO(){
		if (this.postDAO == null) {
			this.postDAO = new MongoPublicacionDAO();
			this.postDAO.setConexion(this.con);
			System.out.println("Creo postDAO ");
		}
		return this.postDAO;
	}
}