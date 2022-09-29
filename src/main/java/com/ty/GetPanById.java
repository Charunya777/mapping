package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPanById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		System.out.println("person info");
		System.out.println("person id is" + person.getId());
		System.out.println("person name is" + person.getName());
		System.out.println("person gender is" + person.getGender());
		System.out.println("_______________________");

		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("pan info");
			System.out.println("pan id is" + pan.getId());
			System.out.println("pan number is" + pan.getNumber());
			System.out.println("pan type is" + pan.getType());
		}
	}

}
