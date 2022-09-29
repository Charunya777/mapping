package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchBikeCharcy {

	public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		
		EntityManager em=emf.createEntityManager();
		
		
		Bike bike=em.find(Bike.class, 1);
		System.out.println("-------Bike info--------");
		System.out.println("Id is :"+bike.getId());
		System.out.println("name is :"+bike.getName());
		System.out.println("bikecost is : "+bike.getCost());
				
		Charcy charcy=bike.getCharcy();
		if(charcy!=null) {
			System.out.println("---------pan info---------");
			System.out.println("pan id is :"+charcy.getId());
			System.out.println("pan number is :"+charcy.getType());
			
			
		}
	}

	}

