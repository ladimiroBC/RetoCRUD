
package controladores;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelos.DataMannager;


public class CrearProductoControlador {
    public void crearProducto(String... datos) throws SQLException{
        DataMannager manejador = new DataMannager();
        String sql = String.format
        ("INSERT INTO productos("
        + "id_producto, nombre, temperatura, valor_base, costo)"
        + "VALUES('%s', '%s', %s, %s, %s)" , datos);
        
        manejador.ejecutarConsulta(sql);
    }
    
    public DefaultTableModel cargarProducto() throws SQLException{
        String[] columnas = {
            "Id Producto",
            "Nombre",
            "Temperatura",
            "Valor Base",
            "Costo"
            
        };
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        DataMannager manejador = new DataMannager();
        ResultSet datos = manejador.obtenerDatos("SELECT * FROM productos");
        String[] registro = new String[5];
        while(datos.next()){
            registro[0]=datos.getString("id_producto");
            registro[1]=datos.getString("nombre");
            registro[2]=String.valueOf(datos.getDouble("temperatura"));
            registro[3]=String.valueOf(datos.getDouble("valor_base"));
            registro[4]=String.valueOf(datos.getDouble("costo"));
            modelo.addRow(registro);
        }
        manejador.cerrar();
        return modelo;
    }
}
