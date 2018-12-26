package br.com.virtualstore.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author fabianos_ 
 * email:fabiano.freitas@gmail.com 
 * Fabiano Freitas
 *
 */

public class Conexao {

	private static EntityManagerFactory factory = null;
	private static EntityManager em = null;

	public static EntityManager getEntityManager() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("virtualPU");
		}
		if (em == null) {
			em = factory.createEntityManager();
		}
		return em;
	}

}
