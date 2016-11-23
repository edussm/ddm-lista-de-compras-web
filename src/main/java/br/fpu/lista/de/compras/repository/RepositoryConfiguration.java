package br.fpu.lista.de.compras.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import br.fpu.lista.de.compras.model.Produto;
import org.springframework.http.MediaType;

@Configuration
public class RepositoryConfiguration extends RepositoryRestMvcConfiguration {
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	    config.exposeIdsFor(Produto.class);
	    config.setBasePath("/rest");
        config.setDefaultMediaType(MediaType.APPLICATION_JSON_UTF8);
    }
}
