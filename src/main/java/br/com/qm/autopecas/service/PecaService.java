package br.com.qm.autopecas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qm.autopecas.entity.Peca;
import br.com.qm.autopecas.repository.PecaRepository;

@Service
public class PecaService {
	@Autowired
	PecaRepository repository;
	
	public Peca inserePeca(Peca peca) {
		if(repository.existsById(peca.getCodBarras())) {
			return null;
		}
		return repository.save(peca);
	}
	
	public Optional<Peca> consultaPeca(long codBarras){
		return repository.findById(codBarras);
	}
	
	public List<Peca> listaPecasEstoque(){
		return (List<Peca>) repository.findAll();
	}
	
	public List<Peca> listarPorNome(String nome){
		return repository.findAllByNomeStartingWith(nome);
	}
	
	public List<Peca> listarPorModelo(String modeloCarro){
		return repository.findAllByModeloCarroLike(modeloCarro);
	}
	
	public List<Peca> listarPorCategoria(String categoria){
		return repository.findAllByCategoriaLike(categoria);
	}
	
	public boolean removePeca(long codBarras) {
		if(!repository.existsById(codBarras)) {
			return false;
		}
		
		repository.deleteById(codBarras);
		return true;
	}
	
}
