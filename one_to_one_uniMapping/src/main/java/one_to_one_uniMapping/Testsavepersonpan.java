package one_to_one_uniMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testsavepersonpan {
public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		
		Pan pan=new Pan();
		pan.setPan_id(100092227);
		
		
		Person person =new Person();
		person.setName("pavan");
		person.setDOB("29/02/2004");
		person.setPan(pan);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
       System.out.println("all good");
	}

}
