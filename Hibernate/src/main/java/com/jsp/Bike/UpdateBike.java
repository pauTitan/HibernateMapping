package com.jsp.Bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBike {
	public static void main(String []args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bike b = entityManager.find(Bike.class,5);
		b.setBrand("Suzuki");
		b.setName("S200");
		
		if(b !=null) {
			entityTransaction.begin();
			entityManager.merge(b);
			entityTransaction.commit();
			System.out.println("data updated");
			}else {
				System.out.println("data not updated");
			}
		
	}

}
