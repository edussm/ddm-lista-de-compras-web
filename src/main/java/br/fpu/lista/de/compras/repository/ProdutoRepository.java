package br.fpu.lista.de.compras.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.fpu.lista.de.compras.model.Produto;

@RepositoryRestResource(path = "produto")
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, String> {

}
