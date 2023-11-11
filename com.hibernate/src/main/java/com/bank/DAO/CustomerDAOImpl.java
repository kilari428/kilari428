package com.bank.DAO;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bank.Entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	
	private  EntityManagerFactory emf=Persistence.createEntityManagerFactory("test1");

	

	@Override
	public void save(Customer cus) {
		

		EntityManager em=emf.createEntityManager();
		EntityTransaction tr= em.getTransaction();
		em.persist(cus);
	
		tr.begin();
	
		
		
		
		tr.commit();
	}

}
