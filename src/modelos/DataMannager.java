
package modelos;

import java.sql.*;
import java.util.*;


public class DataMannager extends DataBase{
    private Connection cnx;
    private Statement sta;
    private ResultSet rset;
    
    public DataMannager(){
        super();
        this.cnx = super.getCnx();
    }
    
    public void ejecutarConsulta(String sql) throws SQLException{
        iniciar();
        this.cnx = super.getCnx();
        sta = cnx.createStatement();
        sta.execute(sql);
        terminar();
    }
    
    public ResultSet obtenerDatos(String sql)throws SQLException{
        iniciar();
        this.sta = cnx.createStatement();
        this.rset = sta.executeQuery(sql);
        return this.rset;
        
    }
    
    public List<Object> resultado(String sql) throws SQLException{
        List<Object> retorno = new ArrayList<>();
        iniciar();
        this.sta = this.cnx.createStatement();
        this.rset = this.sta.executeQuery(sql);
        if(this.rset.next()){
            for(int i=1; i<=this.rset.getMetaData().getColumnCount();i++){
                retorno.add(this.rset.getObject(i));
            }
        }
        terminar();
        return retorno;
    }
    
    @Override
    public void cerrar() throws SQLException{
        if(!this.cnx.isClosed())
            this.cnx.close();
    }
    
    private void iniciar() throws SQLException{
        super.conectar();
        this.cnx = super.getCnx();
    }
    
    public void terminar() throws SQLException{
        super.cerrar();
        this.cnx = super.getCnx();
    }
}
