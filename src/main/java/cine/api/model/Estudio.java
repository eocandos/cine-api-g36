package cine.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estudio")
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudio;

    @Column(length = 20)
    private String nombre;

    @Column
    private String direccion;

    @OneToMany
    private List<Pelicula> pelicula;

    public Integer getIdEstudio() {
        return idEstudio;
    }

    public void setIdEstudio(Integer idEstudio) {
        this.idEstudio = idEstudio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(List<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }


}
