package one_to_many_Bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalBranches {
	public static void main(String []args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		List<Branches> branch = new ArrayList();
		
		Hospital h = new Hospital();
		h.setName("Apollo");
		h.setOwner("Pavan");
		
		Branches b1 = new Branches();
		b1.setName("Apollo");
		b1.setLocation("Mumbai");
		
		Branches b2 = new Branches();
		b2.setName("Apollo");
		b2.setLocation("Chennai");
		
		Branches b3 = new Branches();
		b3.setName("Apollo");
		b3.setLocation("Hyderabad");
		
		branch.add(b1);
		branch.add(b2);
		branch.add(b3);
		
		
		b1.setHospital(h);
		b2.setHospital(h);
		b3.setHospital(h);
		
		h.setBranches(branch);
		
		
		entityTransaction.begin();
		entityManager.persist(h);
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);
		entityTransaction.commit();
		System.out.println("all good");
		
		}

}
