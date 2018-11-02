package accesodatos.modelo;

import java.time.LocalDate;


public class Alumno {
    private String nombre;
    private int id;
    private LocalDate fecNac;
    private boolean activo;

    public Alumno(int id, String nombre,  LocalDate fecNac, boolean activo) {
        this.nombre = nombre;
        this.id = id ;
        this.fecNac = fecNac;
        this.activo = activo;
    }
    public Alumno(String nombre,  LocalDate fecNac, boolean activo) {
        this.nombre = nombre;
        this.fecNac = fecNac;
        this.activo = activo;
    }
    
    public Alumno() {
    }

    

   public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
    
}
