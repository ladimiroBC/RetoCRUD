
package controladores;

import java.sql.*;
import java.util.*;
import modelos.DataMannager;


public class IngresoControlador {
    private boolean valido;

    public boolean isValido() {
        return valido;
    }
    
    public boolean validarUsuario(String usuario, String clave) throws SQLException{
        
        DataMannager manejador = new DataMannager();
        List<Object> lista = new ArrayList<>();
        lista = manejador
                .resultado(String.format
                ("SELECT * FROM usuarios WHERE usuario='%s' AND clave='%s'",usuario, clave));
        if(lista.size()>0){
            this.valido = true;
        }
        return this.valido;
    }
}
