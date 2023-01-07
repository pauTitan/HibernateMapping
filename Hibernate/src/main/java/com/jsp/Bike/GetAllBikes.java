package com.jsp.Bike;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllBikes {
	public static void main(String []args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "Select b From Bike b";
		Query query = entityManager.createQuery(sql);
		List<Bike> bikes = query.getResultList();
		
		for(Bike b:bikes) {
			System.out.println(b.getId());
			System.out.println(b.getBrand());
			System.out.println(b.getModel());
			System.out.println(b.getName());
			
			
		}
		
		
	}

}
