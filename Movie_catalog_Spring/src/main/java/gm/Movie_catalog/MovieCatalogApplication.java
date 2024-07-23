package gm.Movie_catalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gm.Movie_catalog.servicio.IPeliculaServicio;

@SpringBootApplication
public class MovieCatalogApplication implements CommandLineRunner{

	@Autowired
	private IPeliculaServicio peliculaServicio;

	private static final Logger logger = LoggerFactory.getLogger(MovieCatalogApplication.class);

	String nl = System.lineSeparator();

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
		logger.info(nl + "*** Aplicacion Movie Catalog ***" + nl);
	}

}
