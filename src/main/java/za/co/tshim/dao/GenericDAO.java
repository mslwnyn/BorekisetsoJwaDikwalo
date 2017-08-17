package za.co.tshim.dao;

import java.io.Serializable;
import java.util.List;


public interface GenericDAO <T, ID extends Serializable> {
    
        void save(T obj) throws Exception;
	T update(T obj);
	void delete(Object id, Class<T> classe);
	T findByID(ID id);
	List<T> findAll();
	List<T> findAllPag(long begin, long end);

}
