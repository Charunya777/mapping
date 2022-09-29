package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("Mobile info");
		System.out.println("mobile id is =" + mobile.getId());
		System.out.println("mobile name is =" + mobile.getName());
		System.out.println("mobile cost is =" + mobile.getCost());
		System.out.println("_______________________");
		List<Sim> al = mobile.getSims();

		if (al != null) {
			for (Sim sim : al) {
				System.out.println("sim id is = " + sim.getId());
				System.out.println("sim name is = " + sim.getName());
				System.out.println("sim provider is = " + sim.getProvider());
				System.out.println("++++++++++++++++++++++++++");

			}
		}
	}

}
