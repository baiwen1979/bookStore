package app.bookstore.model.dao;

import java.util.List;

public interface EntityDao<TEntity> {

	/**
	 * @param id The primary Id of the entity
	 * @return the entity identified by the Id
	 */
	TEntity get(long id);
	
	/**
	 * get single entity by specified property
	 * @param propertyName The name of the property
	 * @param propertyValue The value of the property
	 * @return  the entity specialized by the property
	 */
	TEntity getSingle(String propertyName, Object propertyValue);
	
	/**
	 * save the entity
	 * @param entity The entity to be saved.
	 */
	void save(TEntity entity);
	
	/**
	 * delete an entity with the primary key id
	 * @param id The primary key id of the entity to be deleted.
	 */
	void delete(long id);
	
	/**
	 * delete the entity
	 * @param entity the entity to be deleted.
	 */
	void delete(TEntity entity);
	
	/**
	 * find all the entity from DAO
	 * @return  the List of entities found
	 */
	List<TEntity> findAll();
	
	/**
	 * find entities with the specified property
	 * @param propertyName The name of the property
	 * @param propertyValue The value of the property
	 * @return the List of entities specialized by the property
	 */
	List<TEntity> findBy(String propertyName, Object propertyValue);
	
	
}
