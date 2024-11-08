package org.example.servlet_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {

    private Connection conn;
    private DriverManager driverManager;

    public boolean conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(System.getenv("DB_URL"), System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));

            if (conn != null) {
                return true;
            }
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Driver não encontrado: " + cnfe.getMessage());
        } catch (SQLException sql) {
            System.err.println("Erro ao conectar ao banco de dados: " + sql.getMessage());
        }
        return false;
    }

    public Connection getConn() {
        return this.conn;
    }

    public boolean desconectar() {
        try {if (conn != null && !conn.isClosed()) {
            conn.close();
            return true;
        }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return false;
    }

}

