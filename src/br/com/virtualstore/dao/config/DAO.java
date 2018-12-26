package br.com.virtualstore.dao.config;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * @author fabianos_
 * email:fabiano.freitas@gmail.com
 * Fabiano Freitas
 * Teste DAO Configuracao
 *
 */

public interface DAO<T, I extends Serializable> {

	public T save(T entity);

	public void remove(T entity);

	public T getById(Class<T> classe, I pk);

	public List<T> getAll(Class<T> classe);

	public EntityManager getEntityManager();

}
