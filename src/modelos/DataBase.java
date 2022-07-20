
package modelos;

import java.sql.*;


public class DataBase {
    private String url;
    private String driver;
    private Connection cnx;

       
    public DataBase(){
        this.driver = "jdbc:sqlite";
        this.url = "reto5DB.db";
    }
    
    protected void conectar() throws SQLException{
        this.cnx = DriverManager.getConnection(this.driver+":"+this.url);
        if(!this.cnx.isClosed())
            System.out.println("conectado");
    }
    
    protected void cerrar() throws SQLException{
        if(!this.cnx.isClosed())
            this.cnx.close();
    }
    
     protected Connection getCnx() {
        return cnx;
    }
}
