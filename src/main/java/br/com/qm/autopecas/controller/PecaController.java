package br.com.qm.autopecas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qm.autopecas.entity.Peca;
import br.com.qm.autopecas.service.PecaService;

@RestController
@RequestMapping("/pecas")
public class PecaController {
	@Autowired
	PecaService pecaService;
	
	@PostMapping
	public Peca inserePeca(@RequestBody Peca Peca) {
		return this.pecaService.inserePeca(Peca);
	}
	
	@GetMapping(path = "/{codBarras}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Optional<Peca> consultarPeca(@PathVariable long codBarras){
		return this.pecaService.consultaPeca(codBarras);
	}
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Peca> listarPecasEstoque(){
		return (List<Peca>) this.pecaService.listaPecasEstoque();
	}
	
	@GetMapping(path = "/{nome}/nome")
	public List<Peca> listarPorNome(@PathVariable String nome){
		return this.pecaService.listarPorNome(nome);
	}
	@GetMapping(path = "/{modeloCarro}/modelo")
	public List<Peca> listarPorModelo(@PathVariable String modeloCarro){
		return this.pecaService.listarPorModelo(modeloCarro);
	}
	@GetMapping(path = "/{categoria}/categoria")
	public List<Peca> listarPorCategoria(@PathVariable String categoria){
		return this.pecaService.listarPorCategoria(categoria);
	}
	
	@DeleteMapping(path = "/{codBarras}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public boolean removePeca(@PathVariable long codBarras) {
		return this.pecaService.removePeca(codBarras);
	}

}
