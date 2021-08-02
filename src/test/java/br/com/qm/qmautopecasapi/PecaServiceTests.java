package br.com.qm.qmautopecasapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.qm.autopecas.entity.Peca;
import br.com.qm.autopecas.exception.ErroDeNegocioException;
import br.com.qm.autopecas.repository.PecaRepository;
import br.com.qm.autopecas.service.PecaService;


@RunWith(MockitoJUnitRunner.class)
public class PecaServiceTests {
	@Mock
	PecaService pecaService;
	
	@Mock
	PecaRepository pecaRepository;
	
	@InjectMocks
	PecaService pecaServices;
	
	@Test
	public void deveAdicionarUmaPeca() throws ErroDeNegocioException{
		Peca peca = new Peca();
		peca.setCodBarras(111L);
		peca.setFabricante("VW");
		peca.setModeloCarro("Polo");
		peca.setNome("Volante");
		peca.setEstoque(10);
		peca.setPcoCusto(100.5F);
		peca.setPcoVenda(500.3F);
		peca.setCategoria("Acessorios");
		
		//Mockito.when(pecaService.inserePeca(peca)).thenReturn(Peca.class)
	}
}
