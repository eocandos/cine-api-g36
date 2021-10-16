package cine.api.repository;

import cine.api.model.Pelicula;
import cine.api.repository.crud.PeliculaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeliculaRepository {

    @Autowired
    PeliculaCrudRepository peliculaCrudRepository;

    public List<Pelicula> obtenerPeliculas() {
        return (List<Pelicula>) peliculaCrudRepository.findAll();
    }

    public Pelicula crearPelicula(Pelicula pelicula) {
        return peliculaCrudRepository.save(pelicula);
    }

}
