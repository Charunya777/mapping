package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBikeCharcy {

	public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		Bike bike=new Bike();
		Charcy charcy=new Charcy();
		bike.setName("yamaha");
		bike.setCost(4556.0);
		bike.setCharcy(charcy);
		charcy.setType("bike charcy");
		
		et.begin();
		em.persist(bike);
		em.persist(charcy);
		et.commit();

	}


}
