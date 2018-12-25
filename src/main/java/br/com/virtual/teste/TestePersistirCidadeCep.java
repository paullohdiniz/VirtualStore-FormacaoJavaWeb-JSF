package br.com.virtual.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.virtual.dao.CidadeDAO;
import br.com.virtual.dao.CidadeDAOImpl;
import br.com.virtual.model.Cep;
import br.com.virtual.model.Cidade;

/**
 * 
 * @author fabianos_
 * email:fabiano.freitas@gmail.com
 * Fabiano Freitas
 *
 */

public class TestePersistirCidadeCep {

	public static void main(String[] args) {
		
		Cidade cidade = new Cidade();
		cidade.setNome("Rio de Janeiro");
		cidade.setSigla("RJ");
		
		Cep cep = new Cep();
		cep.setCep("28940-000");
		cep.setCidade(cidade);
		List<Cep>ceps = new ArrayList<Cep>();
		ceps.add(cep);
		cidade.setCeps(ceps);
		
		CidadeDAO cidadeDAO = new CidadeDAOImpl();
		cidadeDAO.save(cidade);
		
		
		 

	}

}
