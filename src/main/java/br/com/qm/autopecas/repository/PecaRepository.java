package br.com.qm.autopecas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.qm.autopecas.entity.Peca;

@Repository
public interface PecaRepository extends CrudRepository<Peca, Long>  {
	List<Peca> findAllByNomeStartingWith(String nome);
	List<Peca> findAllByModeloCarroLike(String modeloCarro);
	List<Peca> findAllByCategoriaLike(String categoria);
}
