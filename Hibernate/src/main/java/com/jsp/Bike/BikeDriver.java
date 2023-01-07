package com.jsp.Bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriver {
	public static void main(String []args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bike b=new Bike();
		b.setBrand("Yamaha");
		b.setModel("RX150");
		b.setName("RX");
		
		entityTransaction.begin();
		entityManager.persist(b);
		entityTransaction.commit();
		System.out.println("all good");
		
	}

}
