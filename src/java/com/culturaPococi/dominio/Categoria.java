
package com.culturaPococi.dominio;

/**
 *
 * @author Personal
 */
public class Categoria {
    
    private String nombreCategoria;
    private int idCategoria;
    private int superID;

    public Categoria(String nombreCategoria, int idCategoria, int superID) {
        this.nombreCategoria = nombreCategoria;
        this.idCategoria = idCategoria;
        this.superID = superID;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public int getSuperID() {
        return superID;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setSuperID(int superID) {
        this.superID = superID;
    }
            
    
   
    
}
