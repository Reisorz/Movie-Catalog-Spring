package gm.Movie_catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gm.Movie_catalog.modelo.Pelicula;
import gm.Movie_catalog.servicio.IPeliculaServicio;

@SpringBootApplication
public class MovieCatalogApplication implements CommandLineRunner{

	@Autowired
	private IPeliculaServicio peliculaServicio;

	private static final Logger logger = LoggerFactory.getLogger(MovieCatalogApplication.class);

	String nl = System.lineSeparator();
	String nl2 = System.lineSeparator() + System.lineSeparator();
	

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		SpringApplication.run(MovieCatalogApplication.class, args);
		logger.info("Aplicacion finalizada!");
	}

	@Override
	public void run(String... args) throws Exception {
		movieCatalogApp();
	}


	private void movieCatalogApp(){
		logger.info(nl2 + "*** Aplicacion Movie Catalog ***" + nl);
		int opcion = 0;

		while (opcion !=6) {
			opcion = elegirOpcion();
			realizarAccion(opcion);
		}
		
	}

	private int elegirOpcion() {
		Scanner scan = new Scanner(System.in);
		
		logger.info(nl + "Elija una opción: " + nl + 
		"1 - Listar películas." + nl + 
		"2 - Añadir película." + nl + 
		"3 - Modificar película." + nl +
		"4 - Buscar película." + nl +
		"5 - Borrar película." + nl +
		"6 - Cerrar aplicación." + nl + 
		"Opcion: ");
		int opcion = Integer.parseInt(scan.nextLine());
		return opcion;
	}

	private void realizarAccion (Integer opcion) {
		switch (opcion) {
            case 1:
				List<Pelicula> peliculas = listarPeliculas();
				logger.info(nl + "Películas: " + nl);
				for (Pelicula pelicula : peliculas) {
					logger.info(pelicula.toString());
				}
                break;
            
            case 2:
                
                break;

            case 3:

                break;

            case 4:

                break;

            case 5:
                
                break;

            case 6:
                
                System.out.println(nl + "Fin del programa." + nl);
                break;
        
            default:

                System.out.println("Inserta una opción válidad.");
                elegirOpcion();
                break;
        }

	}

	private List<Pelicula> listarPeliculas () {
		List<Pelicula> peliculas = new ArrayList<>();
		peliculas = peliculaServicio.listarPeliculas();
		return peliculas;
	}

}
