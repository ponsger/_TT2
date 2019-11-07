package entitys;
// Generated 25/10/2019 05:16:54 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesor generated by hbm2java
 */
public class Profesor  implements java.io.Serializable {


     private int idUsuario;
     private Usuario usuario;
     private String rutaXmlpreguntas;
     private String rutaXmlejercicios;
     private String rutaXmlexamen;
     private Set grupos = new HashSet(0);

    public Profesor() {
        this.idUsuario = 0;
    }

	
    public Profesor(Usuario usuario) {
        this.usuario = usuario;
    }
    public Profesor(Usuario usuario, String rutaXmlpreguntas, String rutaXmlejercicios, String rutaXmlexamen, Set grupos) {
       this.usuario = usuario;
       this.rutaXmlpreguntas = rutaXmlpreguntas;
       this.rutaXmlejercicios = rutaXmlejercicios;
       this.rutaXmlexamen = rutaXmlexamen;
       this.grupos = grupos;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getRutaXmlpreguntas() {
        return this.rutaXmlpreguntas;
    }
    
    public void setRutaXmlpreguntas(String rutaXmlpreguntas) {
        this.rutaXmlpreguntas = rutaXmlpreguntas;
    }
    public String getRutaXmlejercicios() {
        return this.rutaXmlejercicios;
    }
    
    public void setRutaXmlejercicios(String rutaXmlejercicios) {
        this.rutaXmlejercicios = rutaXmlejercicios;
    }
    public String getRutaXmlexamen() {
        return this.rutaXmlexamen;
    }
    
    public void setRutaXmlexamen(String rutaXmlexamen) {
        this.rutaXmlexamen = rutaXmlexamen;
    }
    public Set getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set grupos) {
        this.grupos = grupos;
    }




}


