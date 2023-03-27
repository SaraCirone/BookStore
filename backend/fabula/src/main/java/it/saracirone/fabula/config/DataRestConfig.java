package it.saracirone.fabula.config;

import it.saracirone.fabula.entities.Genere;
import it.saracirone.fabula.entities.Libro;
import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.entities.Admin;
import it.saracirone.fabula.entities.Utente;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {
	 @Override
	    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

	        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};

	        // disable HTTP methods for Product: PUT, POST, DELETE and PATCH
	        config.getExposureConfiguration()
	                .forDomainType(Libro.class)
	                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
	                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

	        // disable HTTP methods for ProductCategory: PUT, POST, DELETE and PATCH
	        config.getExposureConfiguration()
	                .forDomainType(Genere.class)
	                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
	                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
	        
	        config.getExposureConfiguration()
            .forDomainType(Autore.class)
            .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
            .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

	        config.getExposureConfiguration()
            .forDomainType(Admin.class)
            .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
            .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

	        config.getExposureConfiguration()
            .forDomainType(Utente.class)
            .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
            .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
	    }
}
