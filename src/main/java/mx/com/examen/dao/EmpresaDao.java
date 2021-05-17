package mx.com.examen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.com.examen.dto.Empresa;

@Repository
public class EmpresaDao {
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Empresa> listaCompleta() {
		String filterQuery = "Select e from Empresa e " +
				"INNER JOIN FETCH e.direccion d ";
		
		Query query = entityManager.createQuery(filterQuery);
		List result = query.getResultList();
		
        return result;
    }
	
	@Transactional
	public void save(Empresa empresa) {
		try {
			//entityManager.getTransaction().begin();
			entityManager.persist(empresa);
			//entityManager.getTransaction().commit();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	    	//entityManager.close();
	    }
	}
}

