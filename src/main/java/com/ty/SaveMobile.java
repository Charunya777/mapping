package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setName("Samsung");
		mobile.setCost(500);
		
		Sim sim1 = new Sim();
		sim1.setName("BSNL sim");
		sim1.setProvider("Bsnl");
		
		Sim sim2= new Sim();
		sim2.setName("Airtel sim");
		sim2.setProvider("airtel");
		
		List<Sim> al = new ArrayList<Sim>();
		al.add(sim1);
		al.add(sim2);
		
		mobile.setSims(al);
		sim1.setMobile(mobile);
		sim2.setMobile(mobile);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();

	}

}
