package many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class PersonBankAcc {
	public static void main(String []args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		BankAccount ba = new BankAccount();
		ba.setBankname("Union Bank");
		ba.setAcc_no("773464872155");
		ba.setIfsc("UBI1234");
		ba.setBranch("Puttur");
		
		Person person = new Person();
		person.setName("pavan");
	    
		
		Person person = new Person ();
		person.setBankname("Union Bank");
		person.setAcc_no("773464872155");
		person.setIfsc("UBI1234");
		person.setBranch("Puttur");
		
		
	}

}
