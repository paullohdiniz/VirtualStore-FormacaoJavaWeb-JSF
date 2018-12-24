package br.com.virtual.daoconfig;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.virtual.util.Conexao;

/**
 * 
 * @author fabianos_
 * email:fabiano.freitas@gmail.com
 * Fabiano Freitas
 *
 */


public abstract class DAOImpl<T, I extends Serializable> implements DAO<T, I> {

	private Conexao conexao;

	public T save(T entity) {
		T saved = null;
		getEntityManager().getTransaction().begin();
		saved = getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();
		return saved;
	}

	public void remove(T entity) {
		getEntityManager().getTransaction().begin();
		getEntityManager().remove(entity);
		getEntityManager().getTransaction().commit();
	}
	
	public T getById(Class<T> classe, I pk) {
		try {
			return getEntityManager().find(classe, pk);
		} catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll(Class<T> classe){
		return getEntityManager().createQuery("select o from" + classe.getSimpleName()+ "o")
				.getResultList();
	}
	
	@SuppressWarnings("static-access")
	public EntityManager getEntityManager() {
		if(conexao == null) {
			conexao = new Conexao();
		}
		return conexao.getEntityManager();
	}
	
	
	
	
	
	
	
	
	
	

}
