package br.com.virtual.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.virtual.dao.EnderecoDAO;
import br.com.virtual.dao.EnderecoDAOImpl;
import br.com.virtual.model.Endereco;
import br.com.virtual.model.Estado;

/**
 * 
 * @author fabianos_
 * email:fabiano.freitas@gmail.com
 * Fabiano Freitas
 *
 */

public class TestePersistirEnderecoEstado {
	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das Flores");
		endereco.setNumero("45");
		endereco.setBairro("Ortato");
		endereco.setComplemento("Rio Sete");
		endereco.setCep("28940-000");
		endereco.setReferencia("Teste");
		endereco.setUf("RJ");		
		
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setUf("RJ");	
		estado.setEndereco(endereco);
		List<Estado>estados = new ArrayList<Estado>();
		estados.add(estado);
		endereco.setEstados(estados);	
				
		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
		enderecoDAO.save(endereco);
		 
		
		

	}

}





