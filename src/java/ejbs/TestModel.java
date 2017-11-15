
package ejbs;

import javax.ejb.Stateless;

/**
 * 1
 * en un paquete nuevo en "Source Packages" >> new session bean se le da nombre
 * >> se escoje como Stateless en este caso javax.ejb no tenia la libreria Stateless
 * 
 * -- para resolverlo le di a Libraries >> add Libraries >> java ee 7 api library --
 * 
 * @author DanVz
 */
@Stateless
public class TestModel {
    
    /*2 creo atributos y setters y getters*/

        private String nombre, correo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
        

}
