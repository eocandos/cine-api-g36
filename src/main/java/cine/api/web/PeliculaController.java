package cine.api.web;

import cine.api.model.Pelicula;
import cine.api.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Pelicula")
public class PeliculaController {

    @Autowired
    PeliculaService peliculaService;

    @GetMapping("/todas")
    public List<Pelicula> getPeliculas() {
        return peliculaService.obtenerPeliculas();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Pelicula crearPelicula(@RequestBody Pelicula pelicula){

        return peliculaService.crearPelicula(pelicula);
    }

}
