
package controladores;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelos.DataMannager;


public class EditarProductoControlador {
    public DefaultTableModel cargarProducto() throws SQLException{
        String[] columnas = {
            "Id",
            "Id Producto",
            "Nombre",
            "Temperatura",
            "Valor Base",
            "Costo"
            
        };
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        DataMannager manejador = new DataMannager();
        ResultSet datos = manejador.obtenerDatos("SELECT * FROM productos");
        String[] registro = new String[6];
        while(datos.next()){
            registro[0]=String.valueOf(datos.getInt("id"));
            registro[1]=datos.getString("id_producto");
            registro[2]=datos.getString("nombre");
            registro[3]=String.valueOf(datos.getDouble("temperatura"));
            registro[4]=String.valueOf(datos.getDouble("valor_base"));
            registro[5]=String.valueOf(datos.getDouble("costo"));
            modelo.addRow(registro);
        }
        manejador.cerrar();
        return modelo;
    }
    
    public void actualizarProducto(int id,String... datos) throws SQLException{
        DataMannager manejador = new DataMannager();
        String sql ="UPDATE productos SET "
            + "id_producto='"+datos[0]+"', "
            + "nombre='"+datos[1]+"', "
            + "temperatura="+datos[2]+", "
            + "valor_base="+datos[3]+", "
            + "costo="+datos[4]+""    
            + " WHERE id="+id;
        
        manejador.ejecutarConsulta(sql);
    }
    
    public void eliminarProducto(int id) throws SQLException{
        DataMannager manejador = new DataMannager();
        String sql = "DELETE FROM productos WHERE id="+id;
        manejador.ejecutarConsulta(sql);
    }
}
