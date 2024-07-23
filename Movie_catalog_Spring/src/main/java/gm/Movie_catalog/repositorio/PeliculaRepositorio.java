package gm.Movie_catalog.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.Movie_catalog.modelo.Pelicula;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer>{

}
