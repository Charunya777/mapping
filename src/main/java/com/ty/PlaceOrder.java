package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PlaceOrder {

	public static void main(String[] args) {
		FoodOrder foodorder = new FoodOrder();
		foodorder.setPerson("charunya");
		foodorder.setStatus("placed");
		
		Item item = new Item();
		item.setName("coffee");
		item.setQuantity(1);
		item.setCost(250.00);
		
		Item item1 = new Item();
		item1.setName("pizza");
		item1.setQuantity(1);
		item1.setCost(300.00);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		items.add(item1);
		
		foodorder.setItems(items);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodorder);
		entityManager.persist(item);
		entityManager.persist(item1);
		entityTransaction.commit();
		}

}
