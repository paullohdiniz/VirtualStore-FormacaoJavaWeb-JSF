package br.com.virtual.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.virtual.dao.ClienteDAO;
import br.com.virtual.dao.ClienteDAOImpl;
import br.com.virtual.model.Cliente;
import br.com.virtual.model.Endereco;
import br.com.virtual.model.Telefone;

/**
 * 
 * @author fabianos_
 * email:fabiano.freitas@gmail.com
 * Fabiano Freitas
 *
 */

public class TestePersistirClienteEndereco {

	public static void main(String[] args) {
		
		 Cliente cliente = new Cliente();
		 cliente.setNome("Pedro Henrique Correia");
		
		
		 Endereco endereco = new Endereco();
		 endereco.setLogradouro("Rua das Violetas");
		 endereco.setNumero("45");
		 endereco.setBairro("Ortato");
		 endereco.setComplemento("Rio Sete");
		 endereco.setCep("28940-000");
		 endereco.setReferencia("Teste");
		 endereco.setUf("RJ");	
		 endereco.setCliente(cliente);
		 List<Endereco> enderecos = new ArrayList<Endereco>();
		 enderecos.add(endereco);
		 cliente.setEnderecos(enderecos); 
		  
		 
		 Telefone telefone = new Telefone();
		 telefone.setTelefoneComercial("(11)3456-1212");
		 telefone.setTelefoneResidencial("(11)7893-7458");
		 telefone.setCelular("(11)1234-3456");
		 
		 List<Telefone> telefones = new ArrayList<Telefone>();
		 telefones.add(telefone);		 
		 cliente.setTelefones(telefones);
		 		 
		 
		  
		 ClienteDAO clienteDAO = new ClienteDAOImpl();
		 clienteDAO.save(cliente);
		 
		 
		 
		

	}

}
