package com.jsp.Bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBike {
	
	public static void main(String []args ){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction enityTransaction = entityManager.getTransaction();
		
		Bike b1 = entityManager.find(Bike.class,2);
		if(b1 !=null) {
			System.out.println(b1.getBrand());
			System.out.println(b1.getName());
		}else {
			System.out.println("no bike object found");
		}
	}
}
