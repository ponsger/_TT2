package entitys;
// Generated 11/11/2019 08:09:09 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Grupo generated by hbm2java
 */
public class Grupo  implements java.io.Serializable {


     private Integer idGrupo;
     private Profesor profesor;
     private String nombre;
     private Integer ano;
     private String turno;
     private String rutaXmlasignados;
     private Set alumnos = new HashSet(0);

    public Grupo() {
    }

    public Grupo(Profesor profesor, String nombre, Integer ano, String turno, String rutaXmlasignados, Set alumnos) {
       this.profesor = profesor;
       this.nombre = nombre;
       this.ano = ano;
       this.turno = turno;
       this.rutaXmlasignados = rutaXmlasignados;
       this.alumnos = alumnos;
    }

    public Grupo(String nombre, Integer ano, String turno, String rutaXmlasignados) {
        this.nombre = nombre;
        this.ano = ano;
        this.turno = turno;
        this.rutaXmlasignados = rutaXmlasignados;
    }
    
   
    public Integer getIdGrupo() {
        return this.idGrupo;
    }
    
    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getAno() {
        return this.ano;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getTurno() {
        return this.turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getRutaXmlasignados() {
        return this.rutaXmlasignados;
    }
    
    public void setRutaXmlasignados(String rutaXmlasignados) {
        this.rutaXmlasignados = rutaXmlasignados;
    }
    public Set getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Set alumnos) {
        this.alumnos = alumnos;
    }




}


