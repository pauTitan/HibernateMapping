package com.jsp.Bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DelBike {
	public static void main(String []args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bike b1 = entityManager.find(Bike.class,1);
		if(b1 !=null) {
			entityTransaction.begin();
			entityManager.remove(b1);
			entityTransaction.commit();
			System.out.println("object with above id deleted");
			}
		else {
			System.out.println("id not found");
		}
		
	}

}
