package cine.api.service;

import cine.api.model.Pelicula;
import cine.api.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository peliculaRepository;

    public List<Pelicula> obtenerPeliculas() {
       return peliculaRepository.obtenerPeliculas();
    }

    public Pelicula crearPelicula(Pelicula pelicula) {
        return peliculaRepository.crearPelicula(pelicula);
    }

}
