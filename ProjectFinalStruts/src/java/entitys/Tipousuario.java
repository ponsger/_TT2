package entitys;
// Generated 25/10/2019 05:16:54 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipousuario generated by hbm2java
 */
public class Tipousuario  implements java.io.Serializable {


     private Integer idTipoUsuario;
     private String tipo;
     private Set usuarios = new HashSet(0);

    public Tipousuario() {
    }

    public Tipousuario(String tipo, Set usuarios) {
       this.tipo = tipo;
       this.usuarios = usuarios;
    }
   
    public Integer getIdTipoUsuario() {
        return this.idTipoUsuario;
    }
    
    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

